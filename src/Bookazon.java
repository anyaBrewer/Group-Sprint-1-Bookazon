
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Media> media;
    private ArrayList<User> users;

    public Bookazon() {
        media = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addListing(Media listing) {
        media.add(listing);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewListings() {
        for (Media listing : media) {
            listing.printDetails();
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeListing(Media listing) {
        media.remove(listing);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateRole(User user, Subscription subscription) {
        user.setSubscription(subscription);
    }

    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        // create books
        bookazon.addListing(new PaperbackBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99));
        bookazon.addListing(new HardcoverBook("To Kill a Mockingbird", "Harper Lee", 1960, 7.99));
        bookazon.addListing(new HardcoverBook("1984", "George Orwell", 1949, 8.99));

        // create users
        bookazon.addUser(new User("Alice", new RegularSubscription()));
        bookazon.addUser(new User("Bob", new GoldSubscription()));

        // add books to cart
        bookazon.users.get(0).getCart().addItem(bookazon.media.get(0), 1);
        bookazon.users.get(0).getCart().addItem(bookazon.media.get(1), 1);

        //remove books from cart
        bookazon.users.get(0).getCart().removeItem(bookazon.media.get(1));

        // view cart
        bookazon.users.get(0).viewCart();

        // set shipping address and billing address
        bookazon.users.get(0).setShippingAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        bookazon.users.get(0).setBillingAddress("456 Elm St", "", "Springfield", "IL", "62702", "USA");

        // checkout
        bookazon.users.get(0).checkout();

        // view order details
        bookazon.users.get(0).viewOrders();
        
    }
}
