import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    //Book book1;
    //Book book2;


    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("Hell", "Stephen King", "Horror");
        book2 = new Book("Hill", "Steven Kong", "Leisure");
    }

   @Test
    public void canCheckStock(){
        assertEquals(0, library.stockCount());
    }
    @Test
    public void canAddBookToLibrary(){
        library.newBook(book1);
        assertEquals(1, library.stockCount() );
    }
    @Test
    public void cantAddBookToLibrary() {
        library.newBook(book1);
        //library.newBook(book2);
        assertEquals(1, library.stockCount());
    }
}

