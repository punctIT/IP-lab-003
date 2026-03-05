import java.util.List;

public class Brand {
    private String id;
    private String name;
    private String description;
    private String logoUrl;

    private List<Product> products;

    public Brand() {}
    public Brand(String id, String name, String description, String logoUrl) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getDescription() {}
    public void setDescription(String description) {}
    public String getLogoUrl() {}
    public void setLogoUrl(String logoUrl) {}

    public List<Product> getProducts() {}
    public void setProducts(List<Product> products) {}
    public void addProduct(Product product) {}
    public void removeProduct(Product product) {}

    public int getProductCount() {}

    @Override
    public String toString() {}
}