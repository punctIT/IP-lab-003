import java.util.List;

public class ShipmentStatus {
    private String id;
    private String name;
    private String description;
    private boolean isFinal;

    private List<Shipment> shipments;

    public ShipmentStatus() {}
    public ShipmentStatus(String id, String name, String description, boolean isFinal) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getDescription() {}
    public void setDescription(String description) {}
    public boolean isFinal() {}
    public void setFinal(boolean isFinal) {}

    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    @Override
    public String toString() {}
}