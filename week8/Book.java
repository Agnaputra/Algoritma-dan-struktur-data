package week8;

public class Book {
    String title;
    String authorName;
    int publishedYear;
    int pagesAmount;
    int price;

    public Book(String title, String authorName, int publishedYear, int pagesAmount, int price) {
        this.title = title;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.pagesAmount = pagesAmount;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " by " + authorName + " (" + publishedYear + "), Pages: " + pagesAmount + ", Price: $" + price;
    }
}
