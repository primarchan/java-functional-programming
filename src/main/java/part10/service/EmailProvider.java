package part10.service;

import part10.model.User;

public interface EmailProvider {

    String getEmail(User user);

}
