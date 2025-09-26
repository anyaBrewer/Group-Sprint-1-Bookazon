public class Movie extends Media {
    private String director;
    private int yearReleased;

    public Movie(String title, String director, int yearReleased, double price) {
        super(title, price);
        this.director = director;
        this.yearReleased = yearReleased;
    }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public int getYearReleased() { return yearReleased; }
    public void setYearReleased(int yearReleased) { this.yearReleased = yearReleased; }

    @Override
    public void printDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + director);
        System.out.println("Year Released: " + yearReleased);
        System.out.println("Price: $" + getPrice());
    }
}