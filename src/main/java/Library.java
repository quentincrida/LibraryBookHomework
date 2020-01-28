import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;

    public Library() {
        this.stock = new ArrayList<Book>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void add(Book book) {
        this.stock.add(book);
    }
}
