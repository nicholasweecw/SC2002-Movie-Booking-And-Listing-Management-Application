package Model;

public class Review {
    private int rating;
    private String review;
    private String reviewer;

    public Review(int rating, String review, String reviewer) {
        this.rating = rating;
        this.review = review;
        this.reviewer = reviewer;
    }
}