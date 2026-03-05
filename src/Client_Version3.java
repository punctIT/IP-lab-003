import java.time.Instant;
import java.util.List;

public class Client {
    private String id;
    private int loyaltyPoints;
    private Instant createdAt;
    private String userId;

    private User user;
    private List<ShoppingCart> shoppingCarts;
    private List<Order> orders;
    private List<ProductReview> reviews;
    private List<Return> returns;

    public Client() {}
    public Client(String id, int loyaltyPoints, String userId) {}

    public String getId() {}
    public void setId(String id) {}
    public int getLoyaltyPoints() {}
    public void setLoyaltyPoints(int loyaltyPoints) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public String getUserId() {}
    public void setUserId(String userId) {}

    public User getUser() {}
    public void setUser(User user) {}
    public List<ShoppingCart> getShoppingCarts() {}
    public void setShoppingCarts(List<ShoppingCart> shoppingCarts) {}
    public List<Order> getOrders() {}
    public void setOrders(List<Order> orders) {}
    public List<ProductReview> getReviews() {}
    public void setReviews(List<ProductReview> reviews) {}
    public List<Return> getReturns() {}
    public void setReturns(List<Return> returns) {}

    public void addLoyaltyPoints(int points) {}
    public void deductLoyaltyPoints(int points) {}
    public boolean hasEnoughPoints(int points) {}

    @Override
    public String toString() {}
}