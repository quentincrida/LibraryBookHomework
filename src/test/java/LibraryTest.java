import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {


    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Hell", "Stephen King", "Horror");
    }

   @Test
    public void canCheckStock(){
        assertEquals(0, library.stockCount());
    }
    @Test
    public void canAddBookToLibrary(){
        library.add(book);
        assertEquals(1, library.stockCount() );
    }
}

