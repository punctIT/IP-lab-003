import java.time.Instant;
import java.util.List;

public class Order {
    private String id;
    private String clientId;
    private String sellerId;
    private String status;
    private double total;
    private Instant createdAt;
    private Instant updatedAt;
    private String addressId;

    private Client client;
    private Seller seller;
    private Address address;
    private List<OrderItem> orderItems;
    private List<Invoice> invoices;
    private List<Payment> payments;
    private List<Shipment> shipments;

    public Order() {}
    public Order(String id, String clientId, String sellerId, String status, double total, String addressId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getClientId() {}
    public void setClientId(String clientId) {}
    public String getSellerId() {}
    public void setSellerId(String sellerId) {}
    public String getStatus() {}
    public void setStatus(String status) {}
    public double getTotal() {}
    public void setTotal(double total) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public Instant getUpdatedAt() {}
    public void setUpdatedAt(Instant updatedAt) {}
    public String getAddressId() {}
    public void setAddressId(String addressId) {}

    public Client getClient() {}
    public void setClient(Client client) {}
    public Seller getSeller() {}
    public void setSeller(Seller seller) {}
    public Address getAddress() {}
    public void setAddress(Address address) {}

    public List<OrderItem> getOrderItems() {}
    public void setOrderItems(List<OrderItem> orderItems) {}
    public void addOrderItem(OrderItem item) {}
    public void removeOrderItem(OrderItem item) {}

    public List<Invoice> getInvoices() {}
    public void setInvoices(List<Invoice> invoices) {}
    public List<Payment> getPayments() {}
    public void setPayments(List<Payment> payments) {}
    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    public double calculateTotal() {}
    public boolean isPaid() {}
    public boolean isShipped() {}
    public boolean isDelivered() {}
    public boolean isCancellable() {}
    public void cancel() {}

    @Override
    public String toString() {}
}