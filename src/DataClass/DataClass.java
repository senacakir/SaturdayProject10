package DataClass;

import Books.Book;
import Books.FictionBooks;
import Books.NonFictionBooks;
import Books.ReferenceBooks;
import Functionalities.SelfCheckOut;
import Users.Librarian;
import Users.Student;
import Users.Teacher;
import Users.User;

import java.util.HashMap;

public class DataClass extends SelfCheckOut {
    
    private HashMap<User, Integer> users = new HashMap();
    private HashMap<Book, Integer> books = new HashMap<>();
    private Librarian librarian;
    private Student student;
    private Teacher teacher;
    private FictionBooks fictionBooks;
    private NonFictionBooks nonFictionBooks;
    private ReferenceBooks referenceBooks;
    private int bookID;
    private int userID;

    public HashMap<User, Integer> addUsers() {
        users.put(librarian, userID);
        users.put(student, userID);
        users.put(teacher, userID);
        return users;
    }

    public HashMap<Book, Integer> addBooks() {
        books.put(fictionBooks, bookID);
        books.put(nonFictionBooks, bookID);
        books.put(referenceBooks, bookID);
        return books;
    }
}
