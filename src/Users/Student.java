package Users;

public class Student extends User {

    public Student(String name, String lastname, int userID) {
        super(name, lastname, userID);

        if (!String.valueOf(userID).startsWith("3")){
            System.out.println("Students' userID always starts with 3.");
        }
    }
}
