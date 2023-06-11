package part10.service;

import part10.model.User;

public abstract class AbstractUserService {

    protected abstract boolean validateUser(User user);

    protected abstract void writeToDB(User user);

    public void createUser(User user) {
        if (validateUser(user)) {
            writeToDB(user);
        } else {
            System.out.println("Cannot create user");
        }
    }

}
