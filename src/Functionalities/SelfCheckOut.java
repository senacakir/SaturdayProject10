package Functionalities;

import Books.Book;
import DataClass.DataClass;

import java.time.LocalDate;
import java.util.Scanner;

import static DataClass.DataClass.getBooks;
import static DataClass.DataClass.getUsers;

public class SelfCheckOut {

    public void checkOutBook(int userID, int bookId ){

        int borrowedBooks = 0;
        if (String.valueOf(bookId).startsWith("9")){
            System.out.println("This is a reference book, and it cannot be checked out.");
        }else if (!String.valueOf(userID).equals(getUsers())){
            System.out.println("This is not a registered librarian id. Please enter a valid userId");
        }
        else if(String.valueOf(userID).startsWith("3")){
            System.out.println("It has successfully checked out.");
            System.out.println("User: "+getUsers().equals(userID));
            System.out.println("Book: "+getBooks().equals(bookId));
            LocalDate currentDate = LocalDate.now();
            System.out.println("check out date: " +currentDate);
            LocalDate fourteenDaysInTheFuture = LocalDate.now().plusDays(14);
            System.out.println("due out date: " +fourteenDaysInTheFuture);
            borrowedBooks++;
            if (borrowedBooks<=3){
                System.out.println("You borrowed: " +borrowedBooks+ "books");
            }else {
                System.out.println("You reached your number of book limits!");
            }

        }
        else if(String.valueOf(userID).startsWith("2")){
            System.out.println("It has successfully checked out.");
            System.out.println("User: "+getUsers().equals(userID));
            System.out.println("Book: "+getBooks().equals(bookId));
            LocalDate currentDate = LocalDate.now();
            System.out.println("check out date: " +currentDate);
            LocalDate twentyOneDaysInTheFuture = LocalDate.now().plusDays(21);
            System.out.println("due out date: " +twentyOneDaysInTheFuture);
            borrowedBooks++;
            if (borrowedBooks<=5){
                System.out.println("You borrowed: " +borrowedBooks+ "books");
            }else {
                System.out.println("You reached your number of book limits!");
            }

        }
        else if(String.valueOf(userID).startsWith("1")){
            System.out.println("It has successfully checked out.");
            System.out.println("User: "+getUsers().equals(userID));
            System.out.println("Book: "+getBooks().equals(bookId));
            LocalDate currentDate = LocalDate.now();
            System.out.println("check out date: " +currentDate);
            LocalDate thirtyDaysInTheFuture = LocalDate.now().plusDays(30);
            System.out.println("due out date: " +thirtyDaysInTheFuture);
            borrowedBooks++;
            if (borrowedBooks<=10){
                System.out.println("You borrowed: " +borrowedBooks+ "books");
            }else {
                System.out.println("You reached your number of book limits!");
            }

        }

    }
    public static void CheckInBook(int bookId,LocalDate thirtyDaysInTheFuture )
    {
     LocalDate localNow = LocalDate.now();
         if(thirtyDaysInTheFuture==localNow){
             if(DataClass.getBooks().containsValue(bookId))
             {

                 System.out.println("Thanks for returning it on time. Have a great day.");

             }
             else
                 System.out.println("The Book ID is either invalid or belongs to a book which has not checked out.");

         }
    }
}
