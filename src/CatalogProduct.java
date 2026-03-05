public class CatalogProduct {
    private String id;
    private String catalogId;
    private String productId;

    private Catalog catalog;
    private Product product;

    public CatalogProduct() {}
    public CatalogProduct(String id, String catalogId, String productId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getCatalogId() {}
    public void setCatalogId(String catalogId) {}
    public String getProductId() {}
    public void setProductId(String productId) {}

    public Catalog getCatalog() {}
    public void setCatalog(Catalog catalog) {}
    public Product getProduct() {}
    public void setProduct(Product product) {}

    @Override
    public String toString() {}
}