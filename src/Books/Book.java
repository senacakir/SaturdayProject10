package Books;

import DataClass.DataClass;
import Functionalities.SelfCheckOut;

public class Book extends DataClass {

    SelfCheckOut selfCheckOut = new SelfCheckOut();
    private String name;
    private String author;
    private int bookId;
    private boolean status;

    public Book(String name, String author, int bookId, boolean status){
        this.name = name;
        this.author = author;
        this.bookId = bookId;
        this.status = status;

        if (String.valueOf(bookId).length() != 5){
            System.out.println("bookID's length should be equal to 5");
        }

        if (addBooks().containsValue(bookId)){
            System.out.println("bookIds cannot be the the same as any other book's");
        }
    }
}
