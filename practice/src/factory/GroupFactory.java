package factory;

import models.Group;
import models.User;

public class GroupFactory implements EntityFactory<Group> {
    private static int counter = 1;
    @Override
    public Group create(String name) {
        return new Group("G" + counter++, name);
    }
}