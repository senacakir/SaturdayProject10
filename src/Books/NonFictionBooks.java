package Books;

public class NonFictionBooks extends Book {

    public NonFictionBooks(String name, String author, int bookId, boolean status) {
        super(name, author, bookId, status);

        if (!String.valueOf(bookId).startsWith("2")){
            System.out.println(" Non-Fiction Book ids start with 2.");
        }
    }
}
