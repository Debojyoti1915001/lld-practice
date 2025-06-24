package manager;

import factory.EntityFactory;
import models.User;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private final Map<String, User>users= new HashMap<>();
    public  User createUser(String name, EntityFactory<User>factory){
        User user= factory.create(name);
        users.put(user.getId(),user);
        return user;
    }
    public User getUser(String id){
        return users.get(id);
    }
}