import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("1984", "George Orwell", "Sci-Fi" );
    }

    @Test
    public void countNumberOfBooksInLibrary(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }


}
