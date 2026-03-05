import java.time.Instant;

public class Return {
    private String id;
    private String orderItemId;
    private String clientId;
    private String reason;
    private String status;
    private Instant requestedAt;
    private Instant processedAt;
    private String sellerId;

    private OrderItem orderItem;
    private Client client;
    private Seller seller;

    public Return() {}
    public Return(String id, String orderItemId, String clientId, String reason, String sellerId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getOrderItemId() {}
    public void setOrderItemId(String orderItemId) {}
    public String getClientId() {}
    public void setClientId(String clientId) {}
    public String getReason() {}
    public void setReason(String reason) {}
    public String getStatus() {}
    public void setStatus(String status) {}
    public Instant getRequestedAt() {}
    public void setRequestedAt(Instant requestedAt) {}
    public Instant getProcessedAt() {}
    public void setProcessedAt(Instant processedAt) {}
    public String getSellerId() {}
    public void setSellerId(String sellerId) {}

    public OrderItem getOrderItem() {}
    public void setOrderItem(OrderItem orderItem) {}
    public Client getClient() {}
    public void setClient(Client client) {}
    public Seller getSeller() {}
    public void setSeller(Seller seller) {}

    public boolean isProcessed() {}
    public boolean isPending() {}
    public void approve() {}
    public void reject() {}

    @Override
    public String toString() {}
}