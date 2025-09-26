public class Book extends Media{
    private String author;
    private int yearPublished;
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
        super(title, price);
        this.author = author;
        this.yearPublished = yearPublished;
        this.isPaperback = isPaperback;
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

    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }

    public void updateBookDetails(Book book, String newTitle, String newAuthor, int newYearPublished, double newPrice, boolean isPaperback) {
       setTitle(newTitle);
        setAuthor(newAuthor);
        setYearPublished(newYearPublished);
        setPrice(newPrice);
        setPaperback(isPaperback);
    }

    public void printDetails() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + this.getPrice());
    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }

    public boolean isYearPublishedValid() {
        return yearPublished > 0;
    }
}