package part7;

import part7.model.User;

import java.util.Optional;

public class Section1 {

    public static void main(String[] args) {
        User user1 = new User()
                .setId(1001)
                .setName("Alice")
                .setVerified(false);

        User user2 = new User()
                .setId(1001)
                .setName("Alice")
                .setEmailAddress("alice@gmail.com")
                .setVerified(false);

        System.out.println("Same? : " + userEquals(user2, user1));

        String someEmail = "some@gmail.com";
        String nullEmail = null;

        Optional<String> maybeEmail1 = Optional.of(someEmail);
        Optional<String> maybeEmail2 = Optional.empty();
        Optional<String> maybeEmail3 = Optional.ofNullable(someEmail);
        Optional<String> maybeEmail4 = Optional.ofNullable(nullEmail);

        String email1 = maybeEmail1.get();
        System.out.println("email1 : " + email1);

        // String email2 = maybeEmail2.get();
        // System.out.println("email2 : " + email2);
        if (maybeEmail2.isPresent()) {
            System.out.println(maybeEmail2.get());
        }

        String defaultEmail = "default@gmail.com";

        String email3 = maybeEmail2.orElse(defaultEmail);
        System.out.println("email3 : " + email3);

        String email4 = maybeEmail2.orElseGet(() -> defaultEmail);
        System.out.println("email4 : " + email4);

        String email5 = maybeEmail2.orElseThrow(() -> new RuntimeException("Email is not present."));

    }

    public static boolean userEquals(User u1, User u2) {
        return u1.getId() == u2.getId()
                && u1.getName() == u2.getName()
                && u1.getEmailAddress().equals(u2.getEmailAddress())
                && u1.isVerified() == u2.isVerified();
    }

}
