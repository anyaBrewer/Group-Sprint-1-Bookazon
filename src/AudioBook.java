public class AudioBook extends Media {
    private String author;
    private int yearPublished;
    private String narrator;

    public AudioBook(String title, String author, int yearPublished, double price,
            String narrator) {
        super(title, price);
        this.author = author;
        this.yearPublished = yearPublished;
        this.narrator = narrator;
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

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public void printDetails() {
        System.out.println("Audio Book Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + getPrice());
        System.out.println("Narrator: " + narrator);
    }
}