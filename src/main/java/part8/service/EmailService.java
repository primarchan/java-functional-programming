package part8.service;

import part8.model.User;

public class EmailService {
    public void sendPlayWithFriendsEmail(User user) {
        user.getEmailAddress().ifPresent(email -> System.out.println("Sending 'Play with friends' email to " + email));
    }

    public void sendMakeMoreFriendsEmail(User user) {
        user.getEmailAddress().ifPresent(email -> System.out.println("Sending 'Make more friends' email to " + email));
    }

}
