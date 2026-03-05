import java.time.Instant;
import java.util.List;

public class Seller {
    private String id;
    private String companyName;
    private String cui;
    private String registrationNumber;
    private String legalDocumentsUrl;
    private String onboardingStatus;
    private Instant createdAt;
    private String userId;

    private User user;
    private List<Product> products;
    private List<Order> orders;
    private List<Return> returns;

    public Seller() {}
    public Seller(String id, String companyName, String cui, String registrationNumber,
                  String legalDocumentsUrl, String onboardingStatus, String userId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getCompanyName() {}
    public void setCompanyName(String companyName) {}
    public String getCui() {}
    public void setCui(String cui) {}
    public String getRegistrationNumber() {}
    public void setRegistrationNumber(String registrationNumber) {}
    public String getLegalDocumentsUrl() {}
    public void setLegalDocumentsUrl(String legalDocumentsUrl) {}
    public String getOnboardingStatus() {}
    public void setOnboardingStatus(String onboardingStatus) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public String getUserId() {}
    public void setUserId(String userId) {}

    public User getUser() {}
    public void setUser(User user) {}
    public List<Product> getProducts() {}
    public void setProducts(List<Product> products) {}
    public void addProduct(Product product) {}
    public void removeProduct(Product product) {}
    public List<Order> getOrders() {}
    public void setOrders(List<Order> orders) {}
    public List<Return> getReturns() {}
    public void setReturns(List<Return> returns) {}

    public boolean isOnboarded() {}
    public int getProductCount() {}

    @Override
    public String toString() {}
}