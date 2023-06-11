package part10.service;

import part10.model.User;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserServiceInFunctionalWay {
    private final Predicate<User> validateUser;
    private final Consumer<User> writeDB;

    public UserServiceInFunctionalWay(Predicate<User> validateUser, Consumer<User> writeDB) {
        this.validateUser = validateUser;
        this.writeDB = writeDB;
    }

    public void createUser(User user) {
        if (validateUser.test(user)) {
            writeDB.accept(user);
        } else {
            System.out.println("Cannot create user");
        }
    }

}
