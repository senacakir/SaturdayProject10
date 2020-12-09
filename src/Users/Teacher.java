package Users;

public class Teacher extends User {

    public Teacher(String name, String lastname, int userID) {
        super(name, lastname, userID);

        if (!String.valueOf(userID).startsWith("2")){
            System.out.println("Teachers' userID always starts with 2.");
        }
    }
}
