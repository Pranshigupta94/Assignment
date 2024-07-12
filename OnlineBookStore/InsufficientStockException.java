package OnlineBookStore;

public class InsufficientStockException extends Exception{
    // Creates an error message for insufficient stock
    public InsufficientStockException(String message){
        super(message);
    }
}
