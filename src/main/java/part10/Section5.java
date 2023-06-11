package part10;

import part10.model.User;
import part10.service.InternalUserService;
import part10.service.UserService;
import part10.service.UserServiceInFunctionalWay;

import java.util.Arrays;

public class Section5 {

    public static void main(String[] args) {
        User alice = User.builder(1, "Alice")
                .with(builder -> {
                    builder.emailAddress = "alice@gmail.com";
                    builder.isVerified = false;
                    builder.friendUserIds = Arrays.asList(201, 202, 203, 204, 211, 212, 213, 214);
                }).build();

        UserService userService = new UserService();
        InternalUserService internalUserService = new InternalUserService();

        // userService.createUser(alice);
        internalUserService.createUser(alice);

        UserServiceInFunctionalWay userServiceInFunctionalWay = new UserServiceInFunctionalWay(
                user -> {
                    System.out.println("Validating user " + user.getName());
                    return user.getName() != null && user.getEmailAddress().isPresent();
                },
                user -> {
                    System.out.println("Writing user " + user.getName() + " to DB");
                });
        userServiceInFunctionalWay.createUser(alice);
    }

}
