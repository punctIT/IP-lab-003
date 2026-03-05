import java.util.List;

public class Category {
    private String id;
    private String name;
    private String parentId;
    private String description;
    private boolean isActive;

    private Category parent;
    private List<Category> children;
    private List<Product> products;

    public Category() {}
    public Category(String id, String name, String description, boolean isActive) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getParentId() {}
    public void setParentId(String parentId) {}
    public String getDescription() {}
    public void setDescription(String description) {}
    public boolean isActive() {}
    public void setActive(boolean active) {}

    public Category getParent() {}
    public void setParent(Category parent) {}
    public List<Category> getChildren() {}
    public void setChildren(List<Category> children) {}
    public void addChild(Category child) {}
    public void removeChild(Category child) {}

    public List<Product> getProducts() {}
    public void setProducts(List<Product> products) {}
    public void addProduct(Product product) {}
    public void removeProduct(Product product) {}

    public boolean isRoot() {}
    public boolean hasChildren() {}
    public List<Category> getFullPath() {}
    public void activate() {}
    public void deactivate() {}

    @Override
    public String toString() {}
}