public abstract class Media{
    private double price;
    private String title;

    public Media(String title, double price) {
        
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isPriceValid(){
        return price > 0;
    }

    public boolean isTitleValid() {
        return ValidationUtils.isNonEmpty(title);
    }

    public abstract void printDetails();

}