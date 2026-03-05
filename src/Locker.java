import java.util.List;

public class Locker {
    private String id;
    private String addressId;
    private String name;
    private String type;

    private Address address;
    private List<Shipment> shipments;

    public Locker() {}
    public Locker(String id, String addressId, String name, String type) {}

    public String getId() {}
    public void setId(String id) {}
    public String getAddressId() {}
    public void setAddressId(String addressId) {}
    public String getName() {}
    public void setName(String name) {}
    public String getType() {}
    public void setType(String type) {}

    public Address getAddress() {}
    public void setAddress(Address address) {}
    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    public String getFullLocation() {}

    @Override
    public String toString() {}
}