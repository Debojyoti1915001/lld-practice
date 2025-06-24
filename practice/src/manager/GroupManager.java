package manager;

import factory.EntityFactory;
import models.Group;
import models.User;

import java.util.HashMap;
import java.util.Map;

public class GroupManager {
    private final Map<String, Group>groups= new HashMap<>();
    public Group createGroup(String name, EntityFactory<Group>factory){
        Group group=factory.create(name);
        groups.put(group.getId(),group);
        System.out.println(group.getId() + " " + group.getName());
        return group;
    }
    public void joinGroup(String groupId, User user){
        Group group=groups.get(groupId);
        if(group!=null&&user!=null) {
            group.addUser(user);
            printGroup(group);
        }

    }
    public void getGroup(String groupId) {
        Group group = groups.get(groupId);
        if (group != null) {
            printGroup(group);
        }
    }

    private void printGroup(Group group) {
        System.out.print(group.getId() + " " + group.getName());
        for (User user : group.getUsers()) {
            System.out.print(" " + user.getName());
        }
        System.out.println();
    }
}
