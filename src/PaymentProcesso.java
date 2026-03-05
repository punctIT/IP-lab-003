import java.util.List;

public class PaymentProcessor {
    private String id;
    private String name;
    private String apiUrl;
    private String contactEmail;

    private List<Payment> payments;

    public PaymentProcessor() {}
    public PaymentProcessor(String id, String name, String apiUrl, String contactEmail) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getApiUrl() {}
    public void setApiUrl(String apiUrl) {}
    public String getContactEmail() {}
    public void setContactEmail(String contactEmail) {}

    public List<Payment> getPayments() {}
    public void setPayments(List<Payment> payments) {}

    @Override
    public String toString() {}
}