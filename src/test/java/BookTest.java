import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Hell", "Stephen King", "Horror");
    }
    @Test
    public void bookHasTitle(){
        assertEquals("Hell", book.getTitle());
    }
    @Test
    public void bookHasAuthor(){
        assertEquals("Stephen King", book.getAuthor());
    }
    @Test
    public void bookHasGenre(){
        assertEquals("Horror", book.getGenre());
    }
}
