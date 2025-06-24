import factory.GroupFactory;
import factory.UserFactory;
import manager.GroupManager;
import manager.UserManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        UserFactory userFactory = new UserFactory();
        GroupFactory groupFactory = new GroupFactory();
        UserManager userManager = new UserManager();
        GroupManager groupManager = new GroupManager();
        while(sc.hasNextLine()){
            String input= sc.nextLine().trim();
            if(input.isEmpty())continue;
            String[]parts=input.split(" ");
            String commnad=parts[0];
            switch (commnad){
                case "newUser":
                    userManager.createUser(parts[1], userFactory);
                    break;
                case "newGroup":
                    groupManager.createGroup(parts[1], groupFactory);
                    break;
                case "join":
                    groupManager.joinGroup(parts[1],userManager.getUser(parts[2]));
                    break;
                case "getGroup":
                    groupManager.getGroup(parts[1]);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}