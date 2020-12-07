package Project10;

/*
 * This is a simple and basic school library management software simulation project
 * This project can be done in many ways according to programmer's taste.
 * You are strongly recommended to take the following points into consideration:
 *   - code re-usability
 *   - OOP principals
 *   - adaptability for future updates or changes
 *   - refrain form hard coding as much as you can!
 *   - (optional) if JVM throws an exception, handle them
 */

/*
IMPORTANT NOTE: Since this programs does not connect to an outsource data base/file to get/create users and books, you may
                need to hard code to create some different types of users and books.
 */
public class ReadME {
}

/*
Users:
   Each user has a name, a lastname and a four-digit userID (may have more identifiers if needed)
   userIds cannot be the the same as any other user's
   User functionalities: Each user can borrow (self check out) a book and return (check in) a book
   There are mainly three types of users: Librarian, Teacher and Student

   Librarian:
     Librarians' userId always starts with 1. (For example: 1000)
     Borrowing book: A librarian can borrow at most 10 books AT A TIME for himself/herself
     A librarian can borrow any book for at most for 30 days.
     Librarian has also three extra functionalities:
          Create a user (teacher, student and/or another librarian)
          Create a book (fiction, non-fiction or reference)
          Give(check out) a book to a user

   Teacher:
      Teachers' userID always starts with 2. (For example: 2541)
      A teacher can borrow at most 5 books AT A TIME
      A teacher can borrow any book for at most for 21 days.

   Student:
      Students' userID always starts with 3. (For example: 3999)
      A student can borrow at most 3 books AT A TIME
      A student can borrow any book for at most for 14 days.

Books:
   Each book has a name, a author, a five-digit bookId and a status(checkedIn or not)
   It may have more identifiers if needed.
   bookIds cannot be the the same as any other book's
   There are three types of books: Fiction, Non-Fiction and Reference

   Fiction Books:
      Fiction Book ids start with 1 (For example: 15087)
      Fiction books must have one of the five categories: WORLD_CLASSICS, NOVELS, LITERATURE, EARLY_AGE or GENERAL
      Any user can borrow a fiction book

   Non-Fiction Books:
      Non-Fiction Book ids start with 2 (For example: 20064)
      Non-Fiction books must have one of the four categories: MATH, SCIENCE, SOCIAL, HISTORICAL
      Any user can borrow a non-fiction book

   Reference Books:
      Reference Book ids start with 9 (For example: 96541)
      Reference books are NOT borrowable. (Because, let us say, they are for instant use in the library)

Functionalities:
   Self check out (FYI: check out is a terminological word meaning the book goes OUT of the library as user borrows it)
       A user can borrow a book for himself/herself only.
       User uses the bookId for borrowing a book
       If user passes an invalid bookId, the program should warn/inform the user
       Remember a user cannot borrow a reference book
       If user passes a reference bookId, the program prompts "This is a reference book, and it cannot be checked out."
       If a user successfully checks out a book then the program prints
          "It has successfully checked out." along with the following information
          User's full name, Book's id, name, author, check out date and its due date(the latest date user can return it back)
       Make sure the user has not checked out more than his/her number of book limits


   Check in (FYI: this is a terminological word meaning the book comes IN to the library)
       A user returns any book to the library.
       The book does not necessarily be borrowed by himself/herself. (Literally somebody can return a book a friend borrowed.)
       User uses the bookId for returning a book back
       If user enters a bookId which is invalid or which has not been checked out, then the program warns/inform the user
         "The Book ID is either invalid or belongs to a book which has not checked out."
       If the user enters a correct bookId then the program prints
         "Thanks for returning it on time. Have a great day." if it is returned before or on the due date
         or "Thanks for returning. The due date was ........ Please do your best to return the books on time next time!"

   Check out a book to a user:
       This can be done by the librarian only
       Librarian can do it by using userId and bookId
       If librarian passes an invalid bookId, the program should warn/inform the user
       Remember a user cannot borrow a reference book
       If librarian passes a reference bookId, the program prompts "This is a reference book, and it cannot be checked out."
       If the librarian uses an invalid userId, the program warns/informs:
         "This is not a registered student id. Please enter a valid userId."
       If a librarian successfully checks out a book then the program prints
          "It has successfully checked out." along with the following information
          User's full name, Book's id, name, author, check out date and its due date(the latest date user can return it back)
       Make sure the user has not checked out more than his/her number of book limits

   Create a user:
      This can be done by the librarian only
      Librarian uses necessary information to create/register a user
      The program stores the user data accordingly
      If librarian uses previously assigned userId, the program should warn the librarian.
      Make sure Librarian id starts with 1, Teacher's with 2 and Student's with 3.
      Make sure userIds are four-digit numbers.

   Create a book:
      This can be done by the librarian only
      Librarian uses necessary information to create/register a book
      The program stores the book data accordingly
      If librarian uses previously assigned bookId, the program should warn the librarian.
      Make sure Fiction book id starts with 1, Non-fiction's with 2 and Reference's with 9.
      Make sure bookIds are five-digit numbers.
 */














