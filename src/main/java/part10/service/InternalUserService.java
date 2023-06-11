package part10.service;

import part10.model.User;

public class InternalUserService extends AbstractUserService {

    @Override
    protected boolean validateUser(User user) {
        System.out.println("Validating internal user " + user.getName());
        return true;
    }

    @Override
    protected void writeToDB(User user) {
        System.out.println("Writing user " + user.getName() + " to internal DB");
    }

}
