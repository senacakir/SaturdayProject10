package Functionalities;

import Books.Book;
import DataClass.DataClass;

import java.util.Scanner;

public class SelfCheckOut {

    public static void CheckOutBook()
    {
        System.out.println("Enter userId: ");
        Scanner input = new Scanner(System.in);
        int userIDinput= input.nextInt();
        System.out.println("Enter bookId");
        int bookIDinput = input.nextInt();

        if(!DataClass.getBooks().containsValue(bookIDinput)){
            do
            { System.out.println("BookID is wrong, please enter BookID");
            bookIDinput = input.nextInt();}

            while (!DataClass.getBooks().containsValue(bookIDinput));
        }
        if(DataClass.getBooks().containsValue(bookIDinput) && DataClass.getBooks().containsKey(DataClass.referenceBooks)){
        System.out.println("This is a reference book, and it cannot be checked out.");
    }

    if(!DataClass.getUsers().containsValue(userIDinput)){
        do
        { System.out.println("This is not a registered student id. Please enter a valid userId.");
            userIDinput = input.nextInt();}

        while (!DataClass.getUsers().containsValue(userIDinput));
    }
        if(DataClass.getBooks().containsValue(bookIDinput))
        {
            DataClass.getBooks().remove(bookIDinput);
            System.out.println("It has successfully checked out.");
            System.out.println ("It is due in 7 days!");

        }
        else
            System.out.println("It is not in the library. Please enter a different book to be checked out");

    }

    public static void CheckInBook()
    {
        System.out.println("Enter bookID to be checked in: ");
        Scanner input = new Scanner(System.in);
        int bookCheckIn = input.nextInt();
        System.out.println("Enter the book name: ");
        String bookName = input.next();


        if(DataClass.getBooks().containsValue(bookCheckIn))
        {
           // DataClass.addBooks().put(bookName,bookCheckIn);
            System.out.println("Thanks for returning it on time. Have a great day.");

        }
        else
            System.out.println("The Book ID is either invalid or belongs to a book which has not checked out.");
    }
}
