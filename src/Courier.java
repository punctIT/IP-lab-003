import java.util.List;

public class Courier {
    private String id;
    private String name;
    private String contactPhone;
    private String trackingUrl;

    private List<Shipment> shipments;

    public Courier() {}
    public Courier(String id, String name, String contactPhone, String trackingUrl) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getContactPhone() {}
    public void setContactPhone(String contactPhone) {}
    public String getTrackingUrl() {}
    public void setTrackingUrl(String trackingUrl) {}

    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    public String getTrackingUrlForAwb(String awbNumber) {}
    public int getShipmentCount() {}

    @Override
    public String toString() {}
}