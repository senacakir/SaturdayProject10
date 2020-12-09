package Books;

public class FictionBooks extends Book{



    public FictionBooks(String name, String author, int bookId, boolean status){
        super(name, author, bookId, status);

        if (!String.valueOf(bookId).startsWith("1")){
            System.out.println("Fiction Book ids start with 1.");
        }
    }
}
