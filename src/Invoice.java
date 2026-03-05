import java.time.Instant;

public class Invoice {
    private String id;
    private String orderId;
    private String invoiceNumber;
    private Instant issuedAt;
    private double total;
    private String pdfUrl;

    private Order order;

    public Invoice() {}
    public Invoice(String id, String orderId, String invoiceNumber, double total, String pdfUrl) {}

    public String getId() {}
    public void setId(String id) {}
    public String getOrderId() {}
    public void setOrderId(String orderId) {}
    public String getInvoiceNumber() {}
    public void setInvoiceNumber(String invoiceNumber) {}
    public Instant getIssuedAt() {}
    public void setIssuedAt(Instant issuedAt) {}
    public double getTotal() {}
    public void setTotal(double total) {}
    public String getPdfUrl() {}
    public void setPdfUrl(String pdfUrl) {}

    public Order getOrder() {}
    public void setOrder(Order order) {}

    @Override
    public String toString() {}
}