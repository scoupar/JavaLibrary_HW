import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowersBooks;
    private Book book;

    public Borrower(String name){
        this.name = name;
        this.borrowersBooks = new ArrayList<Book>();
        this.book = book;
    }

    public void addBook(Library library){
        Book bookRemoved = library.removeBook(book);
        this.borrowersBooks.add(bookRemoved);

    }

    public int bookCount(){
        return borrowersBooks.size();
    }
}
