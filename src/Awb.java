import java.time.Instant;
import java.util.List;

public class Awb {
    private String id;
    private String number;
    private Instant createdAt;

    private List<Shipment> shipments;

    public Awb() {}
    public Awb(String id, String number) {}

    public String getId() {}
    public void setId(String id) {}
    public String getNumber() {}
    public void setNumber(String number) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}

    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    @Override
    public String toString() {}
}