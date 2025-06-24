package factory;

import models.User;

public class UserFactory implements EntityFactory<User> {
    private static int counter = 1;
    @Override
    public User create(String name) {
        return new User("U" + counter++, name);
    }
}
