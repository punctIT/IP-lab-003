import java.time.Instant;
import java.util.List;

public class User {
    private String id;
    private String email;
    private String passwordHash;
    private String role;
    private Instant createdAt;
    private Instant updatedAt;

    private UserProfile userProfile;
    private List<Address> addresses;
    private Client client;
    private Seller seller;
    private Admin admin;
    private CatalogManager catalogManager;

    public User() {}
    public User(String id, String email, String passwordHash, String role) {}

    public String getId() {}
    public void setId(String id) {}
    public String getEmail() {}
    public void setEmail(String email) {}
    public String getPasswordHash() {}
    public void setPasswordHash(String passwordHash) {}
    public String getRole() {}
    public void setRole(String role) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public Instant getUpdatedAt() {}
    public void setUpdatedAt(Instant updatedAt) {}

    public UserProfile getUserProfile() {}
    public void setUserProfile(UserProfile userProfile) {}
    public List<Address> getAddresses() {}
    public void setAddresses(List<Address> addresses) {}
    public void addAddress(Address address) {}
    public void removeAddress(Address address) {}

    public Client getClient() {}
    public void setClient(Client client) {}
    public Seller getSeller() {}
    public void setSeller(Seller seller) {}
    public Admin getAdmin() {}
    public void setAdmin(Admin admin) {}
    public CatalogManager getCatalogManager() {}
    public void setCatalogManager(CatalogManager catalogManager) {}

    public boolean isClient() {}
    public boolean isSeller() {}
    public boolean isAdmin() {}
    public boolean isCatalogManager() {}
    public Address getDefaultAddress() {}

    @Override
    public String toString() {}
}