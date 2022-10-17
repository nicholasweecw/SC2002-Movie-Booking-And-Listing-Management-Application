package Model;

public class Payment {
    private String transactionId;
    private MovieGoer purchaser;
    private float price;

    public Payment() {
        // Empty constructor;
        transactionId = null;
        purchaser = null;
        price = -1;
    }

    public Payment(String transactionId, MovieGoer purchaser, float price) {
        this.transactionId = transactionId;
        this.purchaser = purchaser;
        this.price = price;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public MovieGoer getPurchaser() {
        return purchaser;
    }

    public float getPrice() {
        return price;
    }
}
