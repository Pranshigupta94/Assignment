package OnlineBookStore;

public class BookMain {
    public static void main(String[] args) {

        BookStore bookStore = new BookStore("The Java Book Store" );


        //Add sample books to the store

        bookStore.addBook(new Book("Effective Java", "Joshua Bloch", 45.00, 10));
        bookStore.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", 55.00, 5));


        //List all the books
        System.out.println("Books available in the store:/n");
        bookStore.listBooks();

        System.out.println();
        System.out.println("Purchasing books");
        bookStore.purchaseBook("Effective Java", 3, true);

        bookStore.purchaseBook("Java: The Complete Reference",7,false);
    }
}
