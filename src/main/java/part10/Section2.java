package part10;

import part10.model.User;

public class Section2 {

    public static void main(String[] args) {
        /*
        User user = User.builder(1, "Alice")
                .withEmailAddress("alice@gmail.com")
                .withVerified(true)
                .build();
         */

        User user = User.builder(1, "Alice")
                        .with(builder -> {
                            builder.emailAddress = "alice@gmail.com";
                            builder.isVerified = true;
                        }).build();
        System.out.println("user : " + user);
    }

}
