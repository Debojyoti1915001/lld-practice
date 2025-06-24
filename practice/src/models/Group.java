package models;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private String id;
    private List<User>users =  new ArrayList<>();

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void addUser(User user){
        if(!users.contains(user)) users.add(user);
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public List<User> getUsers() { return users; }
}
