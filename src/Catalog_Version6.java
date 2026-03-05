import java.util.List;

public class Catalog {
    private String id;
    private String name;
    private String description;
    private boolean isActive;

    private List<Product> products;

    public Catalog() {}
    public Catalog(String id, String name, String description, boolean isActive) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getDescription() {}
    public void setDescription(String description) {}
    public boolean isActive() {}
    public void setActive(boolean active) {}

    public List<Product> getProducts() {}
    public void setProducts(List<Product> products) {}
    public void addProduct(Product product) {}
    public void removeProduct(Product product) {}

    public void activate() {}
    public void deactivate() {}
    public int getProductCount() {}

    @Override
    public String toString() {}
}