package Books;

public class ReferenceBooks extends Book {

    public ReferenceBooks(String name, String author, int bookId, boolean status) {
        super(name, author, bookId, status);

        if (!String.valueOf(bookId).startsWith("9")){
            System.out.println("Reference Book ids start with 9.");
        }
    }
}
