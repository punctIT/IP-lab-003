public class PromotionProduct {
    private String id;
    private String promotionId;
    private String productId;

    private Promotion promotion;
    private Product product;

    public PromotionProduct() {}
    public PromotionProduct(String id, String promotionId, String productId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getPromotionId() {}
    public void setPromotionId(String promotionId) {}
    public String getProductId() {}
    public void setProductId(String productId) {}

    public Promotion getPromotion() {}
    public void setPromotion(Promotion promotion) {}
    public Product getProduct() {}
    public void setProduct(Product product) {}

    @Override
    public String toString() {}
}