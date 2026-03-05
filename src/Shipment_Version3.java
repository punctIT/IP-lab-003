import java.time.Instant;

public class Shipment {
    private String id;
    private String orderId;
    private String courierId;
    private String awbId;
    private Instant shippedAt;
    private Instant deliveredAt;
    private String shipmentStatusId;
    private String lockerId;

    private Order order;
    private Courier courier;
    private Awb awb;
    private ShipmentStatus shipmentStatus;
    private Locker locker;

    public Shipment() {}
    public Shipment(String id, String orderId, String courierId, String awbId,
                    String shipmentStatusId, String lockerId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getOrderId() {}
    public void setOrderId(String orderId) {}
    public String getCourierId() {}
    public void setCourierId(String courierId) {}
    public String getAwbId() {}
    public void setAwbId(String awbId) {}
    public Instant getShippedAt() {}
    public void setShippedAt(Instant shippedAt) {}
    public Instant getDeliveredAt() {}
    public void setDeliveredAt(Instant deliveredAt) {}
    public String getShipmentStatusId() {}
    public void setShipmentStatusId(String shipmentStatusId) {}
    public String getLockerId() {}
    public void setLockerId(String lockerId) {}

    public Order getOrder() {}
    public void setOrder(Order order) {}
    public Courier getCourier() {}
    public void setCourier(Courier courier) {}
    public Awb getAwb() {}
    public void setAwb(Awb awb) {}
    public ShipmentStatus getShipmentStatus() {}
    public void setShipmentStatus(ShipmentStatus shipmentStatus) {}
    public Locker getLocker() {}
    public void setLocker(Locker locker) {}

    public boolean isDelivered() {}
    public boolean isShipped() {}
    public boolean isToLocker() {}
    public void markAsShipped() {}
    public void markAsDelivered() {}
    public String getTrackingUrl() {}

    @Override
    public String toString() {}
}