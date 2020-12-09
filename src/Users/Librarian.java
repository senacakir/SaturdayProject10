package Users;

public class Librarian extends User{


    public Librarian(String name, String lastname, int userID) {
        super(name, lastname, userID);

        if (!String.valueOf(userID).startsWith("1")){
            System.out.println("Librarians' userId always starts with 1.");
        }
    }
}
