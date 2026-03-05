public class ProductImage {
    private String id;
    private String url;
    private String altText;
    private boolean isPrimary;
    private String productId;

    private Product product;

    public ProductImage() {}
    public ProductImage(String id, String url, String altText, boolean isPrimary, String productId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getUrl() {}
    public void setUrl(String url) {}
    public String getAltText() {}
    public void setAltText(String altText) {}
    public boolean isPrimary() {}
    public void setPrimary(boolean primary) {}
    public String getProductId() {}
    public void setProductId(String productId) {}

    public Product getProduct() {}
    public void setProduct(Product product) {}

    @Override
    public String toString() {}
}