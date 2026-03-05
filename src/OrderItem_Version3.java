import java.util.List;

public class OrderItem {
    private String id;
    private String productId;
    private int quantity;
    private double price;
    private String orderId;

    private Product product;
    private Order order;
    private List<Return> returns;

    public OrderItem() {}
    public OrderItem(String id, String productId, int quantity, double price, String orderId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getProductId() {}
    public void setProductId(String productId) {}
    public int getQuantity() {}
    public void setQuantity(int quantity) {}
    public double getPrice() {}
    public void setPrice(double price) {}
    public String getOrderId() {}
    public void setOrderId(String orderId) {}

    public Product getProduct() {}
    public void setProduct(Product product) {}
    public Order getOrder() {}
    public void setOrder(Order order) {}
    public List<Return> getReturns() {}
    public void setReturns(List<Return> returns) {}

    public double getSubtotal() {}
    public boolean hasReturns() {}

    @Override
    public String toString() {}
}