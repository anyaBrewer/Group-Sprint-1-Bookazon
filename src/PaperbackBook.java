public class PaperbackBook extends Media{
    private String author;
    private int yearPublished;

    public PaperbackBook(String title, String author, int yearPublished, double price) {
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


    public void updateBookDetails(String newTitle, String newAuthor, int newYearPublished, double newPrice) {
       setTitle(newTitle);
        setAuthor(newAuthor);
        setYearPublished(newYearPublished);
        setPrice(newPrice);
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