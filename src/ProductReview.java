import java.time.Instant;

public class ProductReview {
    private String id;
    private String productId;
    private int rating;
    private String comment;
    private Instant createdAt;
    private int sellerRating;
    private String clientId;

    private Product product;
    private Client client;

    public ProductReview() {}
    public ProductReview(String id, String productId, int rating, String comment, int sellerRating, String clientId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getProductId() {}
    public void setProductId(String productId) {}
    public int getRating() {}
    public void setRating(int rating) {}
    public String getComment() {}
    public void setComment(String comment) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public int getSellerRating() {}
    public void setSellerRating(int sellerRating) {}
    public String getClientId() {}
    public void setClientId(String clientId) {}

    public Product getProduct() {}
    public void setProduct(Product product) {}
    public Client getClient() {}
    public void setClient(Client client) {}

    public boolean isPositive() {}
    public boolean isNegative() {}

    @Override
    public String toString() {}
}