public class CartItem {
    private String id;
    private String productId;
    private int quantity;
    private double price;
    private String cartId;

    private Product product;
    private ShoppingCart shoppingCart;

    public CartItem() {}
    public CartItem(String id, String productId, int quantity, double price, String cartId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getProductId() {}
    public void setProductId(String productId) {}
    public int getQuantity() {}
    public void setQuantity(int quantity) {}
    public double getPrice() {}
    public void setPrice(double price) {}
    public String getCartId() {}
    public void setCartId(String cartId) {}

    public Product getProduct() {}
    public void setProduct(Product product) {}
    public ShoppingCart getShoppingCart() {}
    public void setShoppingCart(ShoppingCart shoppingCart) {}

    public double getSubtotal() {}
    public void increaseQuantity(int amount) {}
    public void decreaseQuantity(int amount) {}

    @Override
    public String toString() {}
}