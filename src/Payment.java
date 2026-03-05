import java.time.Instant;

public class Payment {
    private String id;
    private String orderId;
    private String paymentProcessorId;
    private double amount;
    private String status;
    private Instant paidAt;
    private String method;
    private String transactionReference;

    private Order order;
    private PaymentProcessor paymentProcessor;

    public Payment() {}
    public Payment(String id, String orderId, String paymentProcessorId, double amount,
                   String method, String transactionReference) {}

    public String getId() {}
    public void setId(String id) {}
    public String getOrderId() {}
    public void setOrderId(String orderId) {}
    public String getPaymentProcessorId() {}
    public void setPaymentProcessorId(String paymentProcessorId) {}
    public double getAmount() {}
    public void setAmount(double amount) {}
    public String getStatus() {}
    public void setStatus(String status) {}
    public Instant getPaidAt() {}
    public void setPaidAt(Instant paidAt) {}
    public String getMethod() {}
    public void setMethod(String method) {}
    public String getTransactionReference() {}
    public void setTransactionReference(String transactionReference) {}

    public Order getOrder() {}
    public void setOrder(Order order) {}
    public PaymentProcessor getPaymentProcessor() {}
    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {}

    public boolean isCompleted() {}
    public boolean isFailed() {}
    public boolean isPending() {}
    public void markAsCompleted() {}
    public void markAsFailed() {}

    @Override
    public String toString() {}
}