public class ProductSpecification {
    private String id;
    private String name;
    private String value;
    private String productId;

    private Product product;

    public ProductSpecification() {}
    public ProductSpecification(String id, String name, String value, String productId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getValue() {}
    public void setValue(String value) {}
    public String getProductId() {}
    public void setProductId(String productId) {}

    public Product getProduct() {}
    public void setProduct(Product product) {}

    @Override
    public String toString() {}
}