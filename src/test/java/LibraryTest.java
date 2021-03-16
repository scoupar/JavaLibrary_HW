import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;
    private Book book4;



    @Before
    public void before(){
        library = new Library(3);
        book = new Book("1984", "George Orwell", "Sci-Fi" );
        book2 = new Book("Bedlam", "Chris Brookmyre", "Adventure");
        book3 = new Book("The Mezzanine", "Nicholson Baker", "unknown" );
        book4 = new Book("Exhalation", "Ted Chiang", "Sci-Fi");

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

    @Test
    public void cantAddBookIfOverCapacity(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.bookCount());

    }


}
