import java.time.Instant;
import java.util.List;

public class ShoppingCart {
    private String id;
    private Instant createdAt;
    private Instant updatedAt;
    private String clientId;

    private Client client;
    private List<CartItem> cartItems;

    public ShoppingCart() {}
    public ShoppingCart(String id, String clientId) {}

    public String getId() {}
    public void setId(String id) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public Instant getUpdatedAt() {}
    public void setUpdatedAt(Instant updatedAt) {}
    public String getClientId() {}
    public void setClientId(String clientId) {}

    public Client getClient() {}
    public void setClient(Client client) {}
    public List<CartItem> getCartItems() {}
    public void setCartItems(List<CartItem> cartItems) {}

    public void addCartItem(CartItem item) {}
    public void removeCartItem(CartItem item) {}
    public void clearCart() {}
    public double getTotal() {}
    public int getTotalItems() {}
    public boolean isEmpty() {}

    @Override
    public String toString() {}
}