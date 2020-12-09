package Users;

import DataClass.DataClass;

public class User extends DataClass {

    private String name;
    private String lastname;
    private int userID;


    public User(String name, String lastname, int userID) {
        this.name = name;
        this.lastname = lastname;
        this.userID = userID;

        if (String.valueOf(userID).length() != 4){
            System.out.println("userID's length should be equal to 4");
        }

        if (addUsers().containsValue(userID)){
            System.out.println("userIds cannot be the the same as any other user's");
        }
    }
}
