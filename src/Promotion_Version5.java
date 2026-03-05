import java.time.LocalDate;
import java.util.List;

public class Promotion {
    private String id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String discountType;
    private double discountValue;
    private boolean isActive;

    private List<Product> products;

    public Promotion() {}
    public Promotion(String id, String name, String description, LocalDate startDate, LocalDate endDate,
                     String discountType, double discountValue, boolean isActive) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getDescription() {}
    public void setDescription(String description) {}
    public LocalDate getStartDate() {}
    public void setStartDate(LocalDate startDate) {}
    public LocalDate getEndDate() {}
    public void setEndDate(LocalDate endDate) {}
    public String getDiscountType() {}
    public void setDiscountType(String discountType) {}
    public double getDiscountValue() {}
    public void setDiscountValue(double discountValue) {}
    public boolean isActive() {}
    public void setActive(boolean active) {}

    public List<Product> getProducts() {}
    public void setProducts(List<Product> products) {}
    public void addProduct(Product product) {}
    public void removeProduct(Product product) {}

    public boolean isCurrentlyValid() {}
    public double applyDiscount(double originalPrice) {}
    public void activate() {}
    public void deactivate() {}

    @Override
    public String toString() {}
}