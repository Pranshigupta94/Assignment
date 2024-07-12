package OnlineBookStore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    String name;
    List<Book> books;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    // Book Details
    public void listBooks(){

        for(Book book : books){
            System.out.println("Book name : " + book.getTitle());
            System.out.println(" Author name : " + book.getAuthor());
            System.out.println("Price : $" + book.getPrice());
            System.out.println("Quantity available : " + book.getStock());
            System.out.println();
        }
    }


    public void purchaseBook(String title, int quantity, boolean isMember) {
        for(Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                try {
                    double price = book.getPrice();
                    if (isMember){
                        MemberDiscount discount = new MemberDiscount();
                        price = discount.applyDiscount(price);
                    }
                    book.sellBook(quantity);
                    System.out.println("Purchased "+quantity+" copies of "+title+" for $"+price * quantity);
                } catch (InsufficientStockException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Book not available: "+title);
    }
    }

