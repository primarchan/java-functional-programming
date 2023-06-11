package part10.service;

import part10.model.User;

public class VerifyYourEmailAddressEmailProvider implements EmailProvider {

    @Override
    public String getEmail(User user) {
        return "'Verify your email address' email for " + user.getName();
    }

}
