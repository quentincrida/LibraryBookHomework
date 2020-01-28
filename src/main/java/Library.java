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
        this.stock.add(book);
    }
//    public void checkStockBeforeAddingBook(Book book) {
//        if(this.stockCount() <= this.capacity){
//            this.stock.newBook(book);
//        }
    }

