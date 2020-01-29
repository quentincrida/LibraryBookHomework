import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void newBook(Book book) {
        if(canAddBook()){
        this.stock.add(book);}
    }

    public boolean canAddBook() {
        return this.capacity > this.stock.size();
    }
}