import java.util.List;

public class Address {
    private String id;
    private String userId;
    private String label;
    private String street;
    private String city;
    private String county;
    private String postalCode;
    private String country;
    private boolean isDefault;

    private User user;
    private List<Order> orders;
    private List<Locker> lockers;

    public Address() {}
    public Address(String id, String userId, String label, String street, String city,
                   String county, String postalCode, String country, boolean isDefault) {}

    public String getId() {}
    public void setId(String id) {}
    public String getUserId() {}
    public void setUserId(String userId) {}
    public String getLabel() {}
    public void setLabel(String label) {}
    public String getStreet() {}
    public void setStreet(String street) {}
    public String getCity() {}
    public void setCity(String city) {}
    public String getCounty() {}
    public void setCounty(String county) {}
    public String getPostalCode() {}
    public void setPostalCode(String postalCode) {}
    public String getCountry() {}
    public void setCountry(String country) {}
    public boolean isDefault() {}
    public void setDefault(boolean isDefault) {}

    public User getUser() {}
    public void setUser(User user) {}
    public List<Order> getOrders() {}
    public void setOrders(List<Order> orders) {}
    public List<Locker> getLockers() {}
    public void setLockers(List<Locker> lockers) {}

    public String getFormattedAddress() {}
    public void markAsDefault() {}
    public void unmarkAsDefault() {}

    @Override
    public String toString() {}
}