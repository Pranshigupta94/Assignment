package OnlineBookStore;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    //constructor
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
//getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
//reduce the stock by specified quantity

    public void sellBook(int quantity) throws InsufficientStockException {
        if(stock < quantity){
            throw new InsufficientStockException("Insufficient stock of  " + title);
        }
        stock = stock - quantity;
    }
}
