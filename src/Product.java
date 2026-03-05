import java.time.Instant;
import java.util.List;

public class Product {
    private String id;
    private String categoryId;
    private String name;
    private String description;
    private double price;
    private int stock;
    private boolean isActive;
    private Instant createdAt;
    private String brandId;
    private Instant updatedAt;
    private String sellerId;

    private Category category;
    private Brand brand;
    private Seller seller;
    private List<ProductImage> images;
    private List<ProductSpecification> specifications;
    private List<ProductReview> reviews;
    private List<Catalog> catalogs;
    private List<Promotion> promotions;

    public Product() {}
    public Product(String id, String name, String description, double price, int stock, boolean isActive) {}

    public String getId() {}
    public void setId(String id) {}
    public String getCategoryId() {}
    public void setCategoryId(String categoryId) {}
    public String getName() {}
    public void setName(String name) {}
    public String getDescription() {}
    public void setDescription(String description) {}
    public double getPrice() {}
    public void setPrice(double price) {}
    public int getStock() {}
    public void setStock(int stock) {}
    public boolean isActive() {}
    public void setActive(boolean active) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public String getBrandId() {}
    public void setBrandId(String brandId) {}
    public Instant getUpdatedAt() {}
    public void setUpdatedAt(Instant updatedAt) {}
    public String getSellerId() {}
    public void setSellerId(String sellerId) {}

    public Category getCategory() {}
    public void setCategory(Category category) {}
    public Brand getBrand() {}
    public void setBrand(Brand brand) {}
    public Seller getSeller() {}
    public void setSeller(Seller seller) {}

    public List<ProductImage> getImages() {}
    public void setImages(List<ProductImage> images) {}
    public void addImage(ProductImage image) {}
    public void removeImage(ProductImage image) {}

    public List<ProductSpecification> getSpecifications() {}
    public void setSpecifications(List<ProductSpecification> specifications) {}
    public void addSpecification(ProductSpecification spec) {}
    public void removeSpecification(ProductSpecification spec) {}

    public List<ProductReview> getReviews() {}
    public void setReviews(List<ProductReview> reviews) {}
    public void addReview(ProductReview review) {}
    public void removeReview(ProductReview review) {}

    public List<Catalog> getCatalogs() {}
    public void setCatalogs(List<Catalog> catalogs) {}
    public List<Promotion> getPromotions() {}
    public void setPromotions(List<Promotion> promotions) {}

    public boolean isInStock() {}
    public boolean isAvailable() {}
    public void decreaseStock(int quantity) {}
    public void increaseStock(int quantity) {}
    public double getAverageRating() {}
    public double getAverageSellerRating() {}
    public ProductImage getPrimaryImage() {}
    public void activate() {}
    public void deactivate() {}

    @Override
    public String toString() {}
}