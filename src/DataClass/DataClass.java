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
    
    private static HashMap<User, Integer> users = new HashMap();
    private static HashMap<Book, Integer> books = new HashMap<>();
    private Librarian librarian;
    private Student student;
    private Teacher teacher;
    private static FictionBooks fictionBooks;

    public static void setBooks(HashMap<Book, Integer> books) {
        DataClass.books = books;
    }

    private static NonFictionBooks nonFictionBooks;
    public static ReferenceBooks referenceBooks;
    private static int bookID;
    private int userID;

    public HashMap<User, Integer> addUsers() {
        users.put(librarian, userID);
        users.put(student, userID);
        users.put(teacher, userID);
        return users;
    }

    public static HashMap<Book, Integer> addBooks() {
        books.put(fictionBooks, bookID);
        books.put(nonFictionBooks, bookID);
        books.put(referenceBooks, bookID);
        return books;
    }

    public int getUserID() {
        return userID;
    }



    public static HashMap<Book, Integer> getBooks() {
        return books;
    }

    public static HashMap<User, Integer> getUsers() {
        return users;
    }

}
