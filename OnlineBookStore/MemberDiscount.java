package OnlineBookStore;

public class MemberDiscount implements Discount {

    @Override
    public double applyDiscount(double price) {
        return price - price * 0.1; //10% discount
    }
}
