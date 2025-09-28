public class EBook extends Media {
    private String author;
    private int yearPublished;

    public EBook(String title, String author, int yearPublished, double price) {
        super(title, price);
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public void printDetails() {
        System.out.println("E-Book Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + getPrice());
    }

}