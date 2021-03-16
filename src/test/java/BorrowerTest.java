import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("James Smith");
        book = new Book("1984", "George Orwell", "Sci-FI");
    }

    @Test
    public void canBorrowBook(){
        borrower.addBook(library);
        assertEquals(1, borrower.bookCount());
    }
}
