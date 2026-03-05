# Copilot Chat Conversation Export: Java classes for e-commerce database schema

**User:** @punctIT
**Thread URL:** https://github.com/copilot/c/cfcab8e4-33c8-4f8d-8987-d7b0ffe6d040

## @punctIT

.

## Copilot

I'm ready to help you with your software development tasks! I have access to various GitHub tools and can assist you with:

- **Code search** - Finding and understanding code in repositories
- **Reading GitHub data** - Issues, pull requests, files, and repository information
- **Writing to GitHub** - Creating branches, pushing files, and updating content
- **Pull requests** - Creating PRs to solve problems or add features
- **GitHub Issues** - Creating, updating, and managing issues
- **User search** - Finding GitHub users and organizations
- **GitHub support** - Answering questions about GitHub features and troubleshooting

What would you like to do today?

## @punctIT

Describe this image

*System: User retried message*

## Copilot

This image is an **Entity-Relationship Diagram (ERD)** for an **e-commerce platform database**, created using the Eraser diagramming tool. It illustrates the full data model with tables, their fields (columns with data types), and relationships between them. Here's a breakdown of the major domains:

---

### 🛍️ **Product & Catalog Domain**
- **`catalog`** – Product catalogs with name, description, and active status.
- **`catalog_products`** – Join table linking catalogs to products.
- **`products`** – Core product table with category, name, description, price, stock, brand, and seller references.
- **`categories`** – Hierarchical product categories (with `parent_id`).
- **`brands`** – Brand information including logo URL.
- **`product_images`** – Images associated with products (URL, alt text, primary flag).
- **`product_specifications`** – Key-value specifications for products.
- **`product_reviews`** – Customer reviews with ratings, comments, and seller ratings.

### 🏷️ **Promotions**
- **`promotions`** – Discount campaigns with type, value, date range, and active status.
- **`promotion_products`** – Join table linking promotions to products.

### 🛒 **Shopping & Orders**
- **`shopping_carts`** – Carts tied to clients.
- **`cart_items`** – Items in carts with quantity and price.
- **`orders`** – Orders placed by clients, linked to sellers and addresses, with status and total.
- **`order_items`** – Line items within an order.
- **`invoices`** – Invoices generated for orders with PDF URLs.

### 💳 **Payments**
- **`payments`** – Payment records with method, amount, status, and transaction reference.
- **`payment_processors`** – External payment processor info (name, API URL, contact).

### 📦 **Shipping & Delivery**
- **`shipments`** – Shipment records linked to orders, couriers, AWBs, and lockers.
- **`couriers`** – Courier companies with contact info and tracking URLs.
- **`awbs`** – Air waybill numbers with timestamps.
- **`shipment_statuses`** – Status definitions (name, description, `is_final` flag).
- **`lockers`** – Delivery locker locations linked to addresses.

### 🔄 **Returns**
- **`returns`** – Return requests with reason, status, timestamps, and seller reference.

### 👥 **Users & Roles**
- **`users`** – Core user table with email, password hash, role, and timestamps.
- **`user_profiles`** – Extended profile info (first/last name, phone, date of birth).
- **`clients`** – Client accounts with loyalty points, linked to users.
- **`sellers`** – Seller accounts with company details, registration, legal docs, and onboarding status.
- **`admins`** – Admin accounts with permissions, linked to users.
- **`catalog_manager`** – Catalog manager role tracking last search/filter activity.

### 📍 **Addresses**
- **`addresses`** – Full address records (street, city, county, postal code, country) with a default flag, linked to users.

---

### 🔗 **Relationships**
The diagram shows foreign key relationships (indicated by connecting lines) such as:
- Products belong to categories, brands, and sellers
- Orders belong to clients and contain order items
- Payments are linked to orders and payment processors
- Shipments connect to orders, couriers, AWBs, and lockers
- Users branch into clients, sellers, admins, and catalog managers

This is a comprehensive, production-grade schema for a **multi-vendor e-commerce marketplace** supporting product management, promotions, shopping carts, orders, payments, shipping/logistics, returns, and role-based user management.

## @punctIT

Fa clasele pentru diagrama date 
sa nu implementezi  , ci doar semnatura
in stilul
fuct nume(parametri ...);

trebuie sa fie in limnajul java
sa fie complet , cu tot cu atribute

*System: User retried message*

## Copilot



Iată toate clasele Java corespunzătoare diagramei, cu atribute și doar semnăturile metodelor (getteri, setteri, constructori):

```java name=Catalog.java
import java.time.*;

public class Catalog {
    private String id;
    private String name;
    private String description;
    private boolean isActive;

    public Catalog();
    public Catalog(String id, String name, String description, boolean isActive);

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getDescription();
    public void setDescription(String description);
    public boolean isActive();
    public void setActive(boolean isActive);
}
```

```java name=CatalogProducts.java
public class CatalogProducts {
    private String id;
    private String catalogId;
    private String productId;

    public CatalogProducts();
    public CatalogProducts(String id, String catalogId, String productId);

    public String getId();
    public void setId(String id);
    public String getCatalogId();
    public void setCatalogId(String catalogId);
    public String getProductId();
    public void setProductId(String productId);
}
```

```java name=Promotions.java
import java.time.*;

public class Promotions {
    private String id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String discountType;
    private double discountValue;
    private boolean isActive;

    public Promotions();
    public Promotions(String id, String name, String description, LocalDate startDate, LocalDate endDate, String discountType, double discountValue, boolean isActive);

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getDescription();
    public void setDescription(String description);
    public LocalDate getStartDate();
    public void setStartDate(LocalDate startDate);
    public LocalDate getEndDate();
    public void setEndDate(LocalDate endDate);
    public String getDiscountType();
    public void setDiscountType(String discountType);
    public double getDiscountValue();
    public void setDiscountValue(double discountValue);
    public boolean isActive();
    public void setActive(boolean isActive);
}
```

```java name=PromotionProducts.java
public class PromotionProducts {
    private String id;
    private String promotionId;
    private String productId;

    public PromotionProducts();
    public PromotionProducts(String id, String promotionId, String productId);

    public String getId();
    public void setId(String id);
    public String getPromotionId();
    public void setPromotionId(String promotionId);
    public String getProductId();
    public void setProductId(String productId);
}
```

```java name=ProductSpecifications.java
public class ProductSpecifications {
    private String id;
    private String name;
    private String value;
    private String productId;

    public ProductSpecifications();
    public ProductSpecifications(String id, String name, String value, String productId);

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getValue();
    public void setValue(String value);
    public String getProductId();
    public void setProductId(String productId);
}
```

```java name=ProductImages.java
public class ProductImages {
    private String id;
    private String url;
    private String altText;
    private boolean isPrimary;
    private String productId;

    public ProductImages();
    public ProductImages(String id, String url, String altText, boolean isPrimary, String productId);

    public String getId();
    public void setId(String id);
    public String getUrl();
    public void setUrl(String url);
    public String getAltText();
    public void setAltText(String altText);
    public boolean isPrimary();
    public void setPrimary(boolean isPrimary);
    public String getProductId();
    public void setProductId(String productId);
}
```

```java name=Products.java
import java.time.*;

public class Products {
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

    public Products();
    public Products(String id, String categoryId, String name, String description, double price, int stock, boolean isActive, Instant createdAt, String brandId, Instant updatedAt, String sellerId);

    public String getId();
    public void setId(String id);
    public String getCategoryId();
    public void setCategoryId(String categoryId);
    public String getName();
    public void setName(String name);
    public String getDescription();
    public void setDescription(String description);
    public double getPrice();
    public void setPrice(double price);
    public int getStock();
    public void setStock(int stock);
    public boolean isActive();
    public void setActive(boolean isActive);
    public Instant getCreatedAt();
    public void setCreatedAt(Instant createdAt);
    public String getBrandId();
    public void setBrandId(String brandId);
    public Instant getUpdatedAt();
    public void setUpdatedAt(Instant updatedAt);
    public String getSellerId();
    public void setSellerId(String sellerId);
}
```

```java name=Categories.java
public class Categories {
    private String id;
    private String name;
    private String parentId;
    private String description;
    private boolean isActive;

    public Categories();
    public Categories(String id, String name, String parentId, String description, boolean isActive);

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getParentId();
    public void setParentId(String parentId);
    public String getDescription();
    public void setDescription(String description);
    public boolean isActive();
    public void setActive(boolean isActive);
}
```

```java name=Brands.java
public class Brands {
    private String id;
    private String name;
    private String description;
    private String logoUrl;

    public Brands();
    public Brands(String id, String name, String description, String logoUrl);

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getDescription();
    public void setDescription(String description);
    public String getLogoUrl();
    public void setLogoUrl(String logoUrl);
}
```

```java name=CartItems.java
public class CartItems {
    private String id;
    private String productId;
    private int quantity;
    private double price;
    private String cartId;

    public CartItems();
    public CartItems(String id, String productId, int quantity, double price, String cartId);

    public String getId();
    public void setId(String id);
    public String getProductId();
    public void setProductId(String productId);
    public int getQuantity();
    public void setQuantity(int quantity);
    public double getPrice();
    public void setPrice(double price);
    public String getCartId();
    public void setCartId(String cartId);
}
```

```java name=ProductReviews.java
import java.time.*;

public class ProductReviews {
    private String id;
    private String productId;
    private int rating;
    private String comment;
    private Instant createdAt;
    private int sellerRating;
    private String clientId;

    public ProductReviews();
    public ProductReviews(String id, String productId, int rating, String comment, Instant createdAt, int sellerRating, String clientId);

    public String getId();
    public void setId(String id);
    public String getProductId();
    public void setProductId(String productId);
    public int getRating();
    public void setRating(int rating);
    public String getComment();
    public void setComment(String comment);
    public Instant getCreatedAt();
    public void setCreatedAt(Instant createdAt);
    public int getSellerRating();
    public void setSellerRating(int sellerRating);
    public String getClientId();
    public void setClientId(String clientId);
}
```

```java name=ShoppingCarts.java
import java.time.*;

public class ShoppingCarts {
    private String id;
    private Instant createdAt;
    private Instant updatedAt;
    private String clientId;

    public ShoppingCarts();
    public ShoppingCarts(String id, Instant createdAt, Instant updatedAt, String clientId);

    public String getId();
    public void setId(String id);
    public Instant getCreatedAt();
    public void setCreatedAt(Instant createdAt);
    public Instant getUpdatedAt();
    public void setUpdatedAt(Instant updatedAt);
    public String getClientId();
    public void setClientId(String clientId);
}
```

```java name=OrderItems.java
public class OrderItems {
    private String id;
    private String productId;
    private int quantity;
    private double price;
    private String orderId;

    public OrderItems();
    public OrderItems(String id, String productId, int quantity, double price, String orderId);

    public String getId();
    public void setId(String id);
    public String getProductId();
    public void setProductId(String productId);
    public int getQuantity();
    public void setQuantity(int quantity);
    public double getPrice();
    public void setPrice(double price);
    public String getOrderId();
    public void setOrderId(String orderId);
}
```

```java name=Returns.java
import java.time.*;

public class Returns {
    private String id;
    private String orderItemId;
    private String clientId;
    private String reason;
    private String status;
    private Instant requestedAt;
    private Instant processedAt;
    private String sellerId;

    public Returns();
    public Returns(String id, String orderItemId, String clientId, String reason, String status, Instant requestedAt, Instant processedAt, String sellerId);

    public String getId();
    public void setId(String id);
    public String getOrderItemId();
    public void setOrderItemId(String orderItemId);
    public String getClientId();
    public void setClientId(String clientId);
    public String getReason();
    public void setReason(String reason);
    public String getStatus();
    public void setStatus(String status);
    public Instant getRequestedAt();
    public void setRequestedAt(Instant requestedAt);
    public Instant getProcessedAt();
    public void setProcessedAt(Instant processedAt);
    public String getSellerId();
    public void setSellerId(String sellerId);
}
```

```java name=Clients.java
import java.time.*;

public class Clients {
    private String id;
    private int loyaltyPoints;
    private Instant createdAt;
    private String userId;

    public Clients();
    public Clients(String id, int loyaltyPoints, Instant createdAt, String userId);

    public String getId();
    public void setId(String id);
    public int getLoyaltyPoints();
    public void setLoyaltyPoints(int loyaltyPoints);
    public Instant getCreatedAt();
    public void setCreatedAt(Instant createdAt);
    public String getUserId();
    public void setUserId(String userId);
}
```

```java name=Orders.java
import java.time.*;

public class Orders {
    private String id;
    private String clientId;
    private String sellerId;
    private String status;
    private double total;
    private Instant createdAt;
    private Instant updatedAt;
    private String addressId;

    public Orders();
    public Orders(String id, String clientId, String sellerId, String status, double total, Instant createdAt, Instant updatedAt, String addressId);

    public String getId();
    public void setId(String id);
    public String getClientId();
    public void setClientId(String clientId);
    public String getSellerId();
    public void setSellerId(String sellerId);
    public String getStatus();
    public void setStatus(String status);
    public double getTotal();
    public void setTotal(double total);
    public Instant getCreatedAt();
    public void setCreatedAt(Instant createdAt);
    public Instant getUpdatedAt();
    public void setUpdatedAt(Instant updatedAt);
    public String getAddressId();
    public void setAddressId(String addressId);
}
```

```java name=Sellers.java
import java.time.*;

public class Sellers {
    private String id;
    private String companyName;
    private String cui;
    private String registrationNumber;
    private String legalDocumentsUrl;
    private String onboardingStatus;
    private Instant createdAt;
    private String userId;

    public Sellers();
    public Sellers(String id, String companyName, String cui, String registrationNumber, String legalDocumentsUrl, String onboardingStatus, Instant createdAt, String userId);

    public String getId();
    public void setId(String id);
    public String getCompanyName();
    public void setCompanyName(String companyName);
    public String getCui();
    public void setCui(String cui);
    public String getRegistrationNumber();
    public void setRegistrationNumber(String registrationNumber);
    public String getLegalDocumentsUrl();
    public void setLegalDocumentsUrl(String legalDocumentsUrl);
    public String getOnboardingStatus();
    public void setOnboardingStatus(String onboardingStatus);
    public Instant getCreatedAt();
    public void setCreatedAt(Instant createdAt);
    public String getUserId();
    public void setUserId(String userId);
}
```

```java name=Invoices.java
import java.time.*;

public class Invoices {
    private String id;
    private String orderId;
    private String invoiceNumber;
    private Instant issuedAt;
    private double total;
    private String pdfUrl;

    public Invoices();
    public Invoices(String id, String orderId, String invoiceNumber, Instant issuedAt, double total, String pdfUrl);

    public String getId();
    public void setId(String id);
    public String getOrderId();
    public void setOrderId(String orderId);
    public String getInvoiceNumber();
    public void setInvoiceNumber(String invoiceNumber);
    public Instant getIssuedAt();
    public void setIssuedAt(Instant issuedAt);
    public double getTotal();
    public void setTotal(double total);
    public String getPdfUrl();
    public void setPdfUrl(String pdfUrl);
}
```

```java name=Payments.java
import java.time.*;

public class Payments {
    private String id;
    private String orderId;
    private String paymentProcessorId;
    private double amount;
    private String status;
    private Instant paidAt;
    private String method;
    private String transactionReference;

    public Payments();
    public Payments(String id, String orderId, String paymentProcessorId, double amount, String status, Instant paidAt, String method, String transactionReference);

    public String getId();
    public void setId(String id);
    public String getOrderId();
    public void setOrderId(String orderId);
    public String getPaymentProcessorId();
    public void setPaymentProcessorId(String paymentProcessorId);
    public double getAmount();
    public void setAmount(double amount);
    public String getStatus();
    public void setStatus(String status);
    public Instant getPaidAt();
    public void setPaidAt(Instant paidAt);
    public String getMethod();
    public void setMethod(String method);
    public String getTransactionReference();
    public void setTransactionReference(String transactionReference);
}
```

```java name=PaymentProcessors.java
public class PaymentProcessors {
    private String id;
    private String name;
    private String apiUrl;
    private String contactEmail;

    public PaymentProcessors();
    public PaymentProcessors(String id, String name, String apiUrl, String contactEmail);

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getApiUrl();
    public void setApiUrl(String apiUrl);
    public String getContactEmail();
    public void setContactEmail(String contactEmail);
}
```

```java name=Admins.java
public class Admins {
    private String id;
    private String permissions;
    private String userId;

    public Admins();
    public Admins(String id, String permissions, String userId);

    public String getId();
    public void setId(String id);
    public String getPermissions();
    public void setPermissions(String permissions);
    public String getUserId();
    public void setUserId(String userId);
}
```

```java name=Users.java
import java.time.*;

public class Users {
    private String id;
    private String email;
    private String passwordHash;
    private String role;
    private Instant createdAt;
    private Instant updatedAt;

    public Users();
    public Users(String id, String email, String passwordHash, String role, Instant createdAt, Instant updatedAt);

    public String getId();
    public void setId(String id);
    public String getEmail();
    public void setEmail(String email);
    public String getPasswordHash();
    public void setPasswordHash(String passwordHash);
    public String getRole();
    public void setRole(String role);
    public Instant getCreatedAt();
    public void setCreatedAt(Instant createdAt);
    public Instant getUpdatedAt();
    public void setUpdatedAt(Instant updatedAt);
}
```

```java name=CatalogManager.java
import java.time.*;

public class CatalogManager {
    private String id;
    private String userId;
    private String lastSearch;
    private String lastFilter;
    private Instant lastAccessed;

    public CatalogManager();
    public CatalogManager(String id, String userId, String lastSearch, String lastFilter, Instant lastAccessed);

    public String getId();
    public void setId(String id);
    public String getUserId();
    public void setUserId(String userId);
    public String getLastSearch();
    public void setLastSearch(String lastSearch);
    public String getLastFilter();
    public void setLastFilter(String lastFilter);
    public Instant getLastAccessed();
    public void setLastAccessed(Instant lastAccessed);
}
```

```java name=UserProfiles.java
import java.time.*;

public class UserProfiles {
    private String id;
    private String userId;
    private String firstName;
    private String lastName;
    private String phone;
    private LocalDate dateOfBirth;

    public UserProfiles();
    public UserProfiles(String id, String userId, String firstName, String lastName, String phone, LocalDate dateOfBirth);

    public String getId();
    public void setId(String id);
    public String getUserId();
    public void setUserId(String userId);
    public String getFirstName();
    public void setFirstName(String firstName);
    public String getLastName();
    public void setLastName(String lastName);
    public String getPhone();
    public void setPhone(String phone);
    public LocalDate getDateOfBirth();
    public void setDateOfBirth(LocalDate dateOfBirth);
}
```

```java name=Addresses.java
public class Addresses {
    private String id;
    private String userId;
    private String label;
    private String street;
    private String city;
    private String county;
    private String postalCode;
    private String country;
    private boolean isDefault;

    public Addresses();
    public Addresses(String id, String userId, String label, String street, String city, String county, String postalCode, String country, boolean isDefault);

    public String getId();
    public void setId(String id);
    public String getUserId();
    public void setUserId(String userId);
    public String getLabel();
    public void setLabel(String label);
    public String getStreet();
    public void setStreet(String street);
    public String getCity();
    public void setCity(String city);
    public String getCounty();
    public void setCounty(String county);
    public String getPostalCode();
    public void setPostalCode(String postalCode);
    public String getCountry();
    public void setCountry(String country);
    public boolean isDefault();
    public void setDefault(boolean isDefault);
}
```

```java name=Couriers.java
public class Couriers {
    private String id;
    private String name;
    private String contactPhone;
    private String trackingUrl;

    public Couriers();
    public Couriers(String id, String name, String contactPhone, String trackingUrl);

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getContactPhone();
    public void setContactPhone(String contactPhone);
    public String getTrackingUrl();
    public void setTrackingUrl(String trackingUrl);
}
```

```java name=Shipments.java
import java.time.*;

public class Shipments {
    private String id;
    private String orderId;
    private String courierId;
    private String awbId;
    private Instant shippedAt;
    private Instant deliveredAt;
    private String shipmentStatusId;
    private String lockerId;

    public Shipments();
    public Shipments(String id, String orderId, String courierId, String awbId, Instant shippedAt, Instant deliveredAt, String shipmentStatusId, String lockerId);

    public String getId();
    public void setId(String id);
    public String getOrderId();
    public void setOrderId(String orderId);
    public String getCourierId();
    public void setCourierId(String courierId);
    public String getAwbId();
    public void setAwbId(String awbId);
    public Instant getShippedAt();
    public void setShippedAt(Instant shippedAt);
    public Instant getDeliveredAt();
    public void setDeliveredAt(Instant deliveredAt);
    public String getShipmentStatusId();
    public void setShipmentStatusId(String shipmentStatusId);
    public String getLockerId();
    public void setLockerId(String lockerId);
}
```

```java name=Awbs.java
import java.time.*;

public class Awbs {
    private String id;
    private String number;
    private Instant createdAt;

    public Awbs();
    public Awbs(String id, String number, Instant createdAt);

    public String getId();
    public void setId(String id);
    public String getNumber();
    public void setNumber(String number);
    public Instant getCreatedAt();
    public void setCreatedAt(Instant createdAt);
}
```

```java name=ShipmentStatuses.java
public class ShipmentStatuses {
    private String id;
    private String name;
    private String description;
    private boolean isFinal;

    public ShipmentStatuses();
    public ShipmentStatuses(String id, String name, String description, boolean isFinal);

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getDescription();
    public void setDescription(String description);
    public boolean isFinal();
    public void setFinal(boolean isFinal);
}
```

```java name=Lockers.java
public class Lockers {
    private String id;
    private String addressId;
    private String name;
    private String type;

    public Lockers();
    public Lockers(String id, String addressId, String name, String type);

    public String getId();
    public void setId(String id);
    public String getAddressId();
    public void setAddressId(String addressId);
    public String getName();
    public void setName(String name);
    public String getType();
    public void setType(String type);
}
```

---

**Rezumat:** Am generat **31 de clase Java** corespunzătoare tuturor entităților din diagrama de date:

| # | Clasă | | # | Clasă |
|---|-------|-|---|-------|
| 1 | `Catalog` | | 17 | `Sellers` |
| 2 | `CatalogProducts` | | 18 | `Invoices` |
| 3 | `Promotions` | | 19 | `Payments` |
| 4 | `PromotionProducts` | | 20 | `PaymentProcessors` |
| 5 | `ProductSpecifications` | | 21 | `Admins` |
| 6 | `ProductImages` | | 22 | `Users` |
| 7 | `Products` | | 23 | `CatalogManager` |
| 8 | `Categories` | | 24 | `UserProfiles` |
| 9 | `Brands` | | 25 | `Addresses` |
| 10 | `CartItems` | | 26 | `Couriers` |
| 11 | `ProductReviews` | | 27 | `Shipments` |
| 12 | `ShoppingCarts` | | 28 | `Awbs` |
| 13 | `OrderItems` | | 29 | `ShipmentStatuses` |
| 14 | `Returns` | | 30 | `Lockers` |
| 15 | `Clients` | | 31 | |
| 16 | `Orders` | | | |

Fiecare clasă conține: atributele private conform diagramei, constructor implicit, constructor cu toți parametrii, și getteri/setteri — toate doar ca semnături, fără implementare.

## @punctIT

nu vreau sa pui nici un fel de comentariu 
dooresc sa imi dai toate toate clasele din imagine

## Copilot



```
catalog
  id          string pk
  name        string
  description string
  is_active   boolean

catalog_products
  id          string pk
  catalog_id  string
  product_id  string

promotion_products
  id           string pk
  promotion_id string
  product_id   string

promotions
  id             string pk
  name           string
  description    string
  start_date     date
  end_date       date
  discount_type  string
  discount_value decimal
  is_active      boolean

product_specifications
  id         string pk
  name       string
  value      string
  product_id string

product_images
  id         string pk
  url        string
  alt_text   string
  is_primary boolean
  product_id string

products
  id          string pk
  category_id string
  name        string
  description string
  price       decimal
  stock       int
  is_active   boolean
  created_at  timestamp
  brand_id    string
  updated_at  timestamp
  seller_id   string

categories
  id          string pk
  name        string
  parent_id   string
  description string
  is_active   boolean

brands
  id          string pk
  name        string
  description string
  logo_url    string

cart_items
  id         string pk
  product_id string
  quantity   int
  price      decimal
  cart_id    string

product_reviews
  id            string pk
  product_id    string
  rating        int
  comment       string
  created_at    timestamp
  seller_rating int
  client_id     string

shopping_carts
  id         string pk
  created_at timestamp
  updated_at timestamp
  client_id  string

order_items
  id         string pk
  product_id string
  quantity   int
  price      decimal
  order_id   string

returns
  id             string pk
  order_item_id  string
  client_id      string
  reason         string
  status         string
  requested_at   timestamp
  processed_at   timestamp
  seller_id      string

orders
  id         string pk
  client_id  string
  seller_id  string
  status     string
  total      decimal
  created_at timestamp
  updated_at timestamp
  address_id string

invoices
  id             string pk
  order_id       string
  invoice_number string
  issued_at      timestamp
  total          decimal
  pdf_url        string

payments
  id                    string pk
  order_id              string
  payment_processor_id  string
  amount                decimal
  status                string
  paid_at               timestamp
  method                string
  transaction_reference string

payment_processors
  id            string pk
  name          string
  api_url       string
  contact_email string

clients
  id             string pk
  loyalty_points int
  created_at     timestamp
  user_id        string

sellers
  id                  string pk
  company_name        string
  cui                 string
  registration_number string
  legal_documents_url string
  onboarding_status   string
  created_at          timestamp
  user_id             string

admins
  id          string pk
  permissions string
  user_id     string

catalog_manager
  id            string pk
  user_id       string
  last_search   string
  last_filter   string
  last_accessed timestamp

users
  id            string pk
  email         string
  password_hash string
  role          string
  created_at    timestamp
  updated_at    timestamp

user_profiles
  id            string pk
  user_id       string
  first_name    string
  last_name     string
  phone         string
  date_of_birth date

addresses
  id          string pk
  user_id     string
  label       string
  street      string
  city        string
  county      string
  postal_code string
  country     string
  is_default  boolean

shipments
  id                 string pk
  order_id           string
  courier_id         string
  awb_id             string
  shipped_at         timestamp
  delivered_at       timestamp
  shipment_status_id string
  locker_id          string

couriers
  id            string pk
  name          string
  contact_phone string
  tracking_url  string

awbs
  id         string pk
  number     string
  created_at timestamp

shipment_statuses
  id          string pk
  name        string
  description string
  is_final    boolean

lockers
  id         string pk
  address_id string
  name       string
  type       string
```

## @punctIT

nu la asta ma refeream 
doresc sa imi dai clasele scrise in limjadul java , sa fie ok , si legaturile dintre ele
la la fel ca in diagrama 

## Copilot



```java name=Catalog.java
import java.util.List;

public class Catalog {
    private String id;
    private String name;
    private String description;
    private boolean isActive;

    private List<Product> products;
}
```

```java name=CatalogProduct.java
public class CatalogProduct {
    private String id;
    private String catalogId;
    private String productId;

    private Catalog catalog;
    private Product product;
}
```

```java name=Promotion.java
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
}
```

```java name=PromotionProduct.java
public class PromotionProduct {
    private String id;
    private String promotionId;
    private String productId;

    private Promotion promotion;
    private Product product;
}
```

```java name=Product.java
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
}
```

```java name=Category.java
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
}
```

```java name=Brand.java
import java.util.List;

public class Brand {
    private String id;
    private String name;
    private String description;
    private String logoUrl;

    private List<Product> products;
}
```

```java name=ProductImage.java
public class ProductImage {
    private String id;
    private String url;
    private String altText;
    private boolean isPrimary;
    private String productId;

    private Product product;
}
```

```java name=ProductSpecification.java
public class ProductSpecification {
    private String id;
    private String name;
    private String value;
    private String productId;

    private Product product;
}
```

```java name=ProductReview.java
import java.time.Instant;

public class ProductReview {
    private String id;
    private String productId;
    private int rating;
    private String comment;
    private Instant createdAt;
    private int sellerRating;
    private String clientId;

    private Product product;
    private Client client;
}
```

```java name=ShoppingCart.java
import java.time.Instant;
import java.util.List;

public class ShoppingCart {
    private String id;
    private Instant createdAt;
    private Instant updatedAt;
    private String clientId;

    private Client client;
    private List<CartItem> cartItems;
}
```

```java name=CartItem.java
public class CartItem {
    private String id;
    private String productId;
    private int quantity;
    private double price;
    private String cartId;

    private Product product;
    private ShoppingCart shoppingCart;
}
```

```java name=Order.java
import java.time.Instant;
import java.util.List;

public class Order {
    private String id;
    private String clientId;
    private String sellerId;
    private String status;
    private double total;
    private Instant createdAt;
    private Instant updatedAt;
    private String addressId;

    private Client client;
    private Seller seller;
    private Address address;
    private List<OrderItem> orderItems;
    private List<Invoice> invoices;
    private List<Payment> payments;
    private List<Shipment> shipments;
}
```

```java name=OrderItem.java
public class OrderItem {
    private String id;
    private String productId;
    private int quantity;
    private double price;
    private String orderId;

    private Product product;
    private Order order;
    private List<Return> returns;
}
```

```java name=Return.java
import java.time.Instant;

public class Return {
    private String id;
    private String orderItemId;
    private String clientId;
    private String reason;
    private String status;
    private Instant requestedAt;
    private Instant processedAt;
    private String sellerId;

    private OrderItem orderItem;
    private Client client;
    private Seller seller;
}
```

```java name=Invoice.java
import java.time.Instant;

public class Invoice {
    private String id;
    private String orderId;
    private String invoiceNumber;
    private Instant issuedAt;
    private double total;
    private String pdfUrl;

    private Order order;
}
```

```java name=Payment.java
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
}
```

```java name=PaymentProcessor.java
import java.util.List;

public class PaymentProcessor {
    private String id;
    private String name;
    private String apiUrl;
    private String contactEmail;

    private List<Payment> payments;
}
```

```java name=Client.java
import java.time.Instant;
import java.util.List;

public class Client {
    private String id;
    private int loyaltyPoints;
    private Instant createdAt;
    private String userId;

    private User user;
    private List<ShoppingCart> shoppingCarts;
    private List<Order> orders;
    private List<ProductReview> reviews;
    private List<Return> returns;
}
```

```java name=Seller.java
import java.time.Instant;
import java.util.List;

public class Seller {
    private String id;
    private String companyName;
    private String cui;
    private String registrationNumber;
    private String legalDocumentsUrl;
    private String onboardingStatus;
    private Instant createdAt;
    private String userId;

    private User user;
    private List<Product> products;
    private List<Order> orders;
    private List<Return> returns;
}
```

```java name=Admin.java
public class Admin {
    private String id;
    private String permissions;
    private String userId;

    private User user;
}
```

```java name=CatalogManager.java
import java.time.Instant;

public class CatalogManager {
    private String id;
    private String userId;
    private String lastSearch;
    private String lastFilter;
    private Instant lastAccessed;

    private User user;
}
```

```java name=User.java
import java.time.Instant;

public class User {
    private String id;
    private String email;
    private String passwordHash;
    private String role;
    private Instant createdAt;
    private Instant updatedAt;

    private UserProfile userProfile;
    private List<Address> addresses;
    private Client client;
    private Seller seller;
    private Admin admin;
    private CatalogManager catalogManager;
}
```

```java name=UserProfile.java
import java.time.LocalDate;

public class UserProfile {
    private String id;
    private String userId;
    private String firstName;
    private String lastName;
    private String phone;
    private LocalDate dateOfBirth;

    private User user;
}
```

```java name=Address.java
import java.util.List;

public class Address {
    private String id;
    private String userId;
    private String label;
    private String street;
    private String city;
    private String county;
    private String postalCode;
    private String country;
    private boolean isDefault;

    private User user;
    private List<Order> orders;
    private List<Locker> lockers;
}
```

```java name=Shipment.java
import java.time.Instant;

public class Shipment {
    private String id;
    private String orderId;
    private String courierId;
    private String awbId;
    private Instant shippedAt;
    private Instant deliveredAt;
    private String shipmentStatusId;
    private String lockerId;

    private Order order;
    private Courier courier;
    private Awb awb;
    private ShipmentStatus shipmentStatus;
    private Locker locker;
}
```

```java name=Courier.java
import java.util.List;

public class Courier {
    private String id;
    private String name;
    private String contactPhone;
    private String trackingUrl;

    private List<Shipment> shipments;
}
```

```java name=Awb.java
import java.time.Instant;

public class Awb {
    private String id;
    private String number;
    private Instant createdAt;

    private List<Shipment> shipments;
}
```

```java name=ShipmentStatus.java
import java.util.List;

public class ShipmentStatus {
    private String id;
    private String name;
    private String description;
    private boolean isFinal;

    private List<Shipment> shipments;
}
```

```java name=Locker.java
public class Locker {
    private String id;
    private String addressId;
    private String name;
    private String type;

    private Address address;
    private List<Shipment> shipments;
}
```

## @punctIT

nu e bine 
adauga si metodele pentru astea , dupa cum consideri tu gen

## Copilot



```java name=Catalog.java
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String id;
    private String name;
    private String description;
    private boolean isActive;

    private List<Product> products = new ArrayList<>();

    public Catalog() {}

    public Catalog(String id, String name, String description, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isActive = isActive;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public void addProduct(Product product) { this.products.add(product); }
    public void removeProduct(Product product) { this.products.remove(product); }

    public void activate() { this.isActive = true; }
    public void deactivate() { this.isActive = false; }

    public int getProductCount() { return this.products.size(); }

    @Override
    public String toString() {
        return "Catalog{id='" + id + "', name='" + name + "', isActive=" + isActive + "}";
    }
}
```

```java name=CatalogProduct.java
public class CatalogProduct {
    private String id;
    private String catalogId;
    private String productId;

    private Catalog catalog;
    private Product product;

    public CatalogProduct() {}

    public CatalogProduct(String id, String catalogId, String productId) {
        this.id = id;
        this.catalogId = catalogId;
        this.productId = productId;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCatalogId() { return catalogId; }
    public void setCatalogId(String catalogId) { this.catalogId = catalogId; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public Catalog getCatalog() { return catalog; }
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
        this.catalogId = catalog != null ? catalog.getId() : null;
    }

    public Product getProduct() { return product; }
    public void setProduct(Product product) {
        this.product = product;
        this.productId = product != null ? product.getId() : null;
    }

    @Override
    public String toString() {
        return "CatalogProduct{id='" + id + "', catalogId='" + catalogId + "', productId='" + productId + "'}";
    }
}
```

```java name=Promotion.java
import java.time.LocalDate;
import java.util.ArrayList;
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

    private List<Product> products = new ArrayList<>();

    public Promotion() {}

    public Promotion(String id, String name, String description, LocalDate startDate, LocalDate endDate,
                     String discountType, double discountValue, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountType = discountType;
        this.discountValue = discountValue;
        this.isActive = isActive;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getDiscountType() { return discountType; }
    public void setDiscountType(String discountType) { this.discountType = discountType; }

    public double getDiscountValue() { return discountValue; }
    public void setDiscountValue(double discountValue) { this.discountValue = discountValue; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public void addProduct(Product product) { this.products.add(product); }
    public void removeProduct(Product product) { this.products.remove(product); }

    public boolean isCurrentlyValid() {
        LocalDate today = LocalDate.now();
        return isActive && !today.isBefore(startDate) && !today.isAfter(endDate);
    }

    public double applyDiscount(double originalPrice) {
        if (!isCurrentlyValid()) return originalPrice;
        if ("PERCENTAGE".equalsIgnoreCase(discountType)) {
            return originalPrice - (originalPrice * discountValue / 100.0);
        } else if ("FIXED".equalsIgnoreCase(discountType)) {
            return Math.max(0, originalPrice - discountValue);
        }
        return originalPrice;
    }

    public void activate() { this.isActive = true; }
    public void deactivate() { this.isActive = false; }

    @Override
    public String toString() {
        return "Promotion{id='" + id + "', name='" + name + "', discountType='" + discountType +
               "', discountValue=" + discountValue + ", isActive=" + isActive + "}";
    }
}
```

```java name=PromotionProduct.java
public class PromotionProduct {
    private String id;
    private String promotionId;
    private String productId;

    private Promotion promotion;
    private Product product;

    public PromotionProduct() {}

    public PromotionProduct(String id, String promotionId, String productId) {
        this.id = id;
        this.promotionId = promotionId;
        this.productId = productId;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPromotionId() { return promotionId; }
    public void setPromotionId(String promotionId) { this.promotionId = promotionId; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public Promotion getPromotion() { return promotion; }
    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
        this.promotionId = promotion != null ? promotion.getId() : null;
    }

    public Product getProduct() { return product; }
    public void setProduct(Product product) {
        this.product = product;
        this.productId = product != null ? product.getId() : null;
    }

    @Override
    public String toString() {
        return "PromotionProduct{id='" + id + "', promotionId='" + promotionId + "', productId='" + productId + "'}";
    }
}
```

```java name=Product.java
import java.time.Instant;
import java.util.ArrayList;
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
    private List<ProductImage> images = new ArrayList<>();
    private List<ProductSpecification> specifications = new ArrayList<>();
    private List<ProductReview> reviews = new ArrayList<>();
    private List<Catalog> catalogs = new ArrayList<>();
    private List<Promotion> promotions = new ArrayList<>();

    public Product() {}

    public Product(String id, String name, String description, double price, int stock, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.isActive = isActive;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCategoryId() { return categoryId; }
    public void setCategoryId(String categoryId) { this.categoryId = categoryId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; this.updatedAt = Instant.now(); }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; this.updatedAt = Instant.now(); }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; this.updatedAt = Instant.now(); }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; this.updatedAt = Instant.now(); }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; this.updatedAt = Instant.now(); }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public String getBrandId() { return brandId; }
    public void setBrandId(String brandId) { this.brandId = brandId; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }

    public String getSellerId() { return sellerId; }
    public void setSellerId(String sellerId) { this.sellerId = sellerId; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) {
        this.category = category;
        this.categoryId = category != null ? category.getId() : null;
    }

    public Brand getBrand() { return brand; }
    public void setBrand(Brand brand) {
        this.brand = brand;
        this.brandId = brand != null ? brand.getId() : null;
    }

    public Seller getSeller() { return seller; }
    public void setSeller(Seller seller) {
        this.seller = seller;
        this.sellerId = seller != null ? seller.getId() : null;
    }

    public List<ProductImage> getImages() { return images; }
    public void setImages(List<ProductImage> images) { this.images = images; }
    public void addImage(ProductImage image) { this.images.add(image); }
    public void removeImage(ProductImage image) { this.images.remove(image); }

    public List<ProductSpecification> getSpecifications() { return specifications; }
    public void setSpecifications(List<ProductSpecification> specifications) { this.specifications = specifications; }
    public void addSpecification(ProductSpecification spec) { this.specifications.add(spec); }
    public void removeSpecification(ProductSpecification spec) { this.specifications.remove(spec); }

    public List<ProductReview> getReviews() { return reviews; }
    public void setReviews(List<ProductReview> reviews) { this.reviews = reviews; }
    public void addReview(ProductReview review) { this.reviews.add(review); }
    public void removeReview(ProductReview review) { this.reviews.remove(review); }

    public List<Catalog> getCatalogs() { return catalogs; }
    public void setCatalogs(List<Catalog> catalogs) { this.catalogs = catalogs; }

    public List<Promotion> getPromotions() { return promotions; }
    public void setPromotions(List<Promotion> promotions) { this.promotions = promotions; }

    public boolean isInStock() { return stock > 0; }

    public boolean isAvailable() { return isActive && isInStock(); }

    public void decreaseStock(int quantity) {
        if (quantity > stock) throw new IllegalArgumentException("Stoc insuficient");
        this.stock -= quantity;
        this.updatedAt = Instant.now();
    }

    public void increaseStock(int quantity) {
        this.stock += quantity;
        this.updatedAt = Instant.now();
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) return 0.0;
        return reviews.stream().mapToInt(ProductReview::getRating).average().orElse(0.0);
    }

    public double getAverageSellerRating() {
        if (reviews.isEmpty()) return 0.0;
        return reviews.stream().mapToInt(ProductReview::getSellerRating).average().orElse(0.0);
    }

    public ProductImage getPrimaryImage() {
        return images.stream().filter(ProductImage::isPrimary).findFirst().orElse(null);
    }

    public void activate() { this.isActive = true; this.updatedAt = Instant.now(); }
    public void deactivate() { this.isActive = false; this.updatedAt = Instant.now(); }

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "', price=" + price + ", stock=" + stock +
               ", isActive=" + isActive + "}";
    }
}
```

```java name=Category.java
import java.util.ArrayList;
import java.util.List;

public class Category {
    private String id;
    private String name;
    private String parentId;
    private String description;
    private boolean isActive;

    private Category parent;
    private List<Category> children = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public Category() {}

    public Category(String id, String name, String description, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isActive = isActive;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getParentId() { return parentId; }
    public void setParentId(String parentId) { this.parentId = parentId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    public Category getParent() { return parent; }
    public void setParent(Category parent) {
        this.parent = parent;
        this.parentId = parent != null ? parent.getId() : null;
    }

    public List<Category> getChildren() { return children; }
    public void setChildren(List<Category> children) { this.children = children; }
    public void addChild(Category child) { this.children.add(child); child.setParent(this); }
    public void removeChild(Category child) { this.children.remove(child); child.setParent(null); }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
    public void addProduct(Product product) { this.products.add(product); }
    public void removeProduct(Product product) { this.products.remove(product); }

    public boolean isRoot() { return parent == null; }
    public boolean hasChildren() { return !children.isEmpty(); }

    public List<Category> getFullPath() {
        List<Category> path = new ArrayList<>();
        Category current = this;
        while (current != null) {
            path.add(0, current);
            current = current.getParent();
        }
        return path;
    }

    public void activate() { this.isActive = true; }
    public void deactivate() { this.isActive = false; }

    @Override
    public String toString() {
        return "Category{id='" + id + "', name='" + name + "', isActive=" + isActive + "}";
    }
}
```

```java name=Brand.java
import java.util.ArrayList;
import java.util.List;

public class Brand {
    private String id;
    private String name;
    private String description;
    private String logoUrl;

    private List<Product> products = new ArrayList<>();

    public Brand() {}

    public Brand(String id, String name, String description, String logoUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.logoUrl = logoUrl;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
    public void addProduct(Product product) { this.products.add(product); }
    public void removeProduct(Product product) { this.products.remove(product); }

    public int getProductCount() { return products.size(); }

    @Override
    public String toString() {
        return "Brand{id='" + id + "', name='" + name + "'}";
    }
}
```

```java name=ProductImage.java
public class ProductImage {
    private String id;
    private String url;
    private String altText;
    private boolean isPrimary;
    private String productId;

    private Product product;

    public ProductImage() {}

    public ProductImage(String id, String url, String altText, boolean isPrimary, String productId) {
        this.id = id;
        this.url = url;
        this.altText = altText;
        this.isPrimary = isPrimary;
        this.productId = productId;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getAltText() { return altText; }
    public void setAltText(String altText) { this.altText = altText; }

    public boolean isPrimary() { return isPrimary; }
    public void setPrimary(boolean primary) { isPrimary = primary; }

    public String getProductId() { return productId; }

## @punctIT

metode fara implementare

## Copilot



```java name=Catalog.java
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
```

```java name=CatalogProduct.java
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
```

```java name=Promotion.java
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
```

```java name=PromotionProduct.java
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
```

```java name=Product.java
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
```

```java name=Category.java
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
```

```java name=Brand.java
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
```

```java name=ProductImage.java
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
```

```java name=ProductSpecification.java
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
```

```java name=ProductReview.java
import java.time.Instant;

public class ProductReview {
    private String id;
    private String productId;
    private int rating;
    private String comment;
    private Instant createdAt;
    private int sellerRating;
    private String clientId;

    private Product product;
    private Client client;

    public ProductReview() {}
    public ProductReview(String id, String productId, int rating, String comment, int sellerRating, String clientId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getProductId() {}
    public void setProductId(String productId) {}
    public int getRating() {}
    public void setRating(int rating) {}
    public String getComment() {}
    public void setComment(String comment) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public int getSellerRating() {}
    public void setSellerRating(int sellerRating) {}
    public String getClientId() {}
    public void setClientId(String clientId) {}

    public Product getProduct() {}
    public void setProduct(Product product) {}
    public Client getClient() {}
    public void setClient(Client client) {}

    public boolean isPositive() {}
    public boolean isNegative() {}

    @Override
    public String toString() {}
}
```

```java name=ShoppingCart.java
import java.time.Instant;
import java.util.List;

public class ShoppingCart {
    private String id;
    private Instant createdAt;
    private Instant updatedAt;
    private String clientId;

    private Client client;
    private List<CartItem> cartItems;

    public ShoppingCart() {}
    public ShoppingCart(String id, String clientId) {}

    public String getId() {}
    public void setId(String id) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public Instant getUpdatedAt() {}
    public void setUpdatedAt(Instant updatedAt) {}
    public String getClientId() {}
    public void setClientId(String clientId) {}

    public Client getClient() {}
    public void setClient(Client client) {}
    public List<CartItem> getCartItems() {}
    public void setCartItems(List<CartItem> cartItems) {}

    public void addCartItem(CartItem item) {}
    public void removeCartItem(CartItem item) {}
    public void clearCart() {}
    public double getTotal() {}
    public int getTotalItems() {}
    public boolean isEmpty() {}

    @Override
    public String toString() {}
}
```

```java name=CartItem.java
public class CartItem {
    private String id;
    private String productId;
    private int quantity;
    private double price;
    private String cartId;

    private Product product;
    private ShoppingCart shoppingCart;

    public CartItem() {}
    public CartItem(String id, String productId, int quantity, double price, String cartId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getProductId() {}
    public void setProductId(String productId) {}
    public int getQuantity() {}
    public void setQuantity(int quantity) {}
    public double getPrice() {}
    public void setPrice(double price) {}
    public String getCartId() {}
    public void setCartId(String cartId) {}

    public Product getProduct() {}
    public void setProduct(Product product) {}
    public ShoppingCart getShoppingCart() {}
    public void setShoppingCart(ShoppingCart shoppingCart) {}

    public double getSubtotal() {}
    public void increaseQuantity(int amount) {}
    public void decreaseQuantity(int amount) {}

    @Override
    public String toString() {}
}
```

```java name=Order.java
import java.time.Instant;
import java.util.List;

public class Order {
    private String id;
    private String clientId;
    private String sellerId;
    private String status;
    private double total;
    private Instant createdAt;
    private Instant updatedAt;
    private String addressId;

    private Client client;
    private Seller seller;
    private Address address;
    private List<OrderItem> orderItems;
    private List<Invoice> invoices;
    private List<Payment> payments;
    private List<Shipment> shipments;

    public Order() {}
    public Order(String id, String clientId, String sellerId, String status, double total, String addressId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getClientId() {}
    public void setClientId(String clientId) {}
    public String getSellerId() {}
    public void setSellerId(String sellerId) {}
    public String getStatus() {}
    public void setStatus(String status) {}
    public double getTotal() {}
    public void setTotal(double total) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public Instant getUpdatedAt() {}
    public void setUpdatedAt(Instant updatedAt) {}
    public String getAddressId() {}
    public void setAddressId(String addressId) {}

    public Client getClient() {}
    public void setClient(Client client) {}
    public Seller getSeller() {}
    public void setSeller(Seller seller) {}
    public Address getAddress() {}
    public void setAddress(Address address) {}

    public List<OrderItem> getOrderItems() {}
    public void setOrderItems(List<OrderItem> orderItems) {}
    public void addOrderItem(OrderItem item) {}
    public void removeOrderItem(OrderItem item) {}

    public List<Invoice> getInvoices() {}
    public void setInvoices(List<Invoice> invoices) {}
    public List<Payment> getPayments() {}
    public void setPayments(List<Payment> payments) {}
    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    public double calculateTotal() {}
    public boolean isPaid() {}
    public boolean isShipped() {}
    public boolean isDelivered() {}
    public boolean isCancellable() {}
    public void cancel() {}

    @Override
    public String toString() {}
}
```

```java name=OrderItem.java
import java.util.List;

public class OrderItem {
    private String id;
    private String productId;
    private int quantity;
    private double price;
    private String orderId;

    private Product product;
    private Order order;
    private List<Return> returns;

    public OrderItem() {}
    public OrderItem(String id, String productId, int quantity, double price, String orderId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getProductId() {}
    public void setProductId(String productId) {}
    public int getQuantity() {}
    public void setQuantity(int quantity) {}
    public double getPrice() {}
    public void setPrice(double price) {}
    public String getOrderId() {}
    public void setOrderId(String orderId) {}

    public Product getProduct() {}
    public void setProduct(Product product) {}
    public Order getOrder() {}
    public void setOrder(Order order) {}
    public List<Return> getReturns() {}
    public void setReturns(List<Return> returns) {}

    public double getSubtotal() {}
    public boolean hasReturns() {}

    @Override
    public String toString() {}
}
```

```java name=Return.java
import java.time.Instant;

public class Return {
    private String id;
    private String orderItemId;
    private String clientId;
    private String reason;
    private String status;
    private Instant requestedAt;
    private Instant processedAt;
    private String sellerId;

    private OrderItem orderItem;
    private Client client;
    private Seller seller;

    public Return() {}
    public Return(String id, String orderItemId, String clientId, String reason, String sellerId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getOrderItemId() {}
    public void setOrderItemId(String orderItemId) {}
    public String getClientId() {}
    public void setClientId(String clientId) {}
    public String getReason() {}
    public void setReason(String reason) {}
    public String getStatus() {}
    public void setStatus(String status) {}
    public Instant getRequestedAt() {}
    public void setRequestedAt(Instant requestedAt) {}
    public Instant getProcessedAt() {}
    public void setProcessedAt(Instant processedAt) {}
    public String getSellerId() {}
    public void setSellerId(String sellerId) {}

    public OrderItem getOrderItem() {}
    public void setOrderItem(OrderItem orderItem) {}
    public Client getClient() {}
    public void setClient(Client client) {}
    public Seller getSeller() {}
    public void setSeller(Seller seller) {}

    public boolean isProcessed() {}
    public boolean isPending() {}
    public void approve() {}
    public void reject() {}

    @Override
    public String toString() {}
}
```

```java name=Invoice.java
import java.time.Instant;

public class Invoice {
    private String id;
    private String orderId;
    private String invoiceNumber;
    private Instant issuedAt;
    private double total;
    private String pdfUrl;

    private Order order;

    public Invoice() {}
    public Invoice(String id, String orderId, String invoiceNumber, double total, String pdfUrl) {}

    public String getId() {}
    public void setId(String id) {}
    public String getOrderId() {}
    public void setOrderId(String orderId) {}
    public String getInvoiceNumber() {}
    public void setInvoiceNumber(String invoiceNumber) {}
    public Instant getIssuedAt() {}
    public void setIssuedAt(Instant issuedAt) {}
    public double getTotal() {}
    public void setTotal(double total) {}
    public String getPdfUrl() {}
    public void setPdfUrl(String pdfUrl) {}

    public Order getOrder() {}
    public void setOrder(Order order) {}

    @Override
    public String toString() {}
}
```

```java name=Payment.java
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
```

```java name=PaymentProcessor.java
import java.util.List;

public class PaymentProcessor {
    private String id;
    private String name;
    private String apiUrl;
    private String contactEmail;

    private List<Payment> payments;

    public PaymentProcessor() {}
    public PaymentProcessor(String id, String name, String apiUrl, String contactEmail) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getApiUrl() {}
    public void setApiUrl(String apiUrl) {}
    public String getContactEmail() {}
    public void setContactEmail(String contactEmail) {}

    public List<Payment> getPayments() {}
    public void setPayments(List<Payment> payments) {}

    @Override
    public String toString() {}
}
```

```java name=Client.java
import java.time.Instant;
import java.util.List;

public class Client {
    private String id;
    private int loyaltyPoints;
    private Instant createdAt;
    private String userId;

    private User user;
    private List<ShoppingCart> shoppingCarts;
    private List<Order> orders;
    private List<ProductReview> reviews;
    private List<Return> returns;

    public Client() {}
    public Client(String id, int loyaltyPoints, String userId) {}

    public String getId() {}
    public void setId(String id) {}
    public int getLoyaltyPoints() {}
    public void setLoyaltyPoints(int loyaltyPoints) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public String getUserId() {}
    public void setUserId(String userId) {}

    public User getUser() {}
    public void setUser(User user) {}
    public List<ShoppingCart> getShoppingCarts() {}
    public void setShoppingCarts(List<ShoppingCart> shoppingCarts) {}
    public List<Order> getOrders() {}
    public void setOrders(List<Order> orders) {}
    public List<ProductReview> getReviews() {}
    public void setReviews(List<ProductReview> reviews) {}
    public List<Return> getReturns() {}
    public void setReturns(List<Return> returns) {}

    public void addLoyaltyPoints(int points) {}
    public void deductLoyaltyPoints(int points) {}
    public boolean hasEnoughPoints(int points) {}

    @Override
    public String toString() {}
}
```

```java name=Seller.java
import java.time.Instant;
import java.util.List;

public class Seller {
    private String id;
    private String companyName;
    private String cui;
    private String registrationNumber;
    private String legalDocumentsUrl;
    private String onboardingStatus;
    private Instant createdAt;
    private String userId;

    private User user;
    private List<Product> products;
    private List<Order> orders;
    private List<Return> returns;

    public Seller() {}
    public Seller(String id, String companyName, String cui, String registrationNumber,
                  String legalDocumentsUrl, String onboardingStatus, String userId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getCompanyName() {}
    public void setCompanyName(String companyName) {}
    public String getCui() {}
    public void setCui(String cui) {}
    public String getRegistrationNumber() {}
    public void setRegistrationNumber(String registrationNumber) {}
    public String getLegalDocumentsUrl() {}
    public void setLegalDocumentsUrl(String legalDocumentsUrl) {}
    public String getOnboardingStatus() {}
    public void setOnboardingStatus(String onboardingStatus) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public String getUserId() {}
    public void setUserId(String userId) {}

    public User getUser() {}
    public void setUser(User user) {}
    public List<Product> getProducts() {}
    public void setProducts(List<Product> products) {}
    public void addProduct(Product product) {}
    public void removeProduct(Product product) {}
    public List<Order> getOrders() {}
    public void setOrders(List<Order> orders) {}
    public List<Return> getReturns() {}
    public void setReturns(List<Return> returns) {}

    public boolean isOnboarded() {}
    public int getProductCount() {}

    @Override
    public String toString() {}
}
```

```java name=Admin.java
public class Admin {
    private String id;
    private String permissions;
    private String userId;

    private User user;

    public Admin() {}
    public Admin(String id, String permissions, String userId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getPermissions() {}
    public void setPermissions(String permissions) {}
    public String getUserId() {}
    public void setUserId(String userId) {}

    public User getUser() {}
    public void setUser(User user) {}

    public boolean hasPermission(String permission) {}

    @Override
    public String toString() {}
}
```

```java name=CatalogManager.java
import java.time.Instant;

public class CatalogManager {
    private String id;
    private String userId;
    private String lastSearch;
    private String lastFilter;
    private Instant lastAccessed;

    private User user;

    public CatalogManager() {}
    public CatalogManager(String id, String userId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getUserId() {}
    public void setUserId(String userId) {}
    public String getLastSearch() {}
    public void setLastSearch(String lastSearch) {}
    public String getLastFilter() {}
    public void setLastFilter(String lastFilter) {}
    public Instant getLastAccessed() {}
    public void setLastAccessed(Instant lastAccessed) {}

    public User getUser() {}
    public void setUser(User user) {}

    public void updateLastAccess() {}

    @Override
    public String toString() {}
}
```

```java name=User.java
import java.time.Instant;
import java.util.List;

public class User {
    private String id;
    private String email;
    private String passwordHash;
    private String role;
    private Instant createdAt;
    private Instant updatedAt;

    private UserProfile userProfile;
    private List<Address> addresses;
    private Client client;
    private Seller seller;
    private Admin admin;
    private CatalogManager catalogManager;

    public User() {}
    public User(String id, String email, String passwordHash, String role) {}

    public String getId() {}
    public void setId(String id) {}
    public String getEmail() {}
    public void setEmail(String email) {}
    public String getPasswordHash() {}
    public void setPasswordHash(String passwordHash) {}
    public String getRole() {}
    public void setRole(String role) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}
    public Instant getUpdatedAt() {}
    public void setUpdatedAt(Instant updatedAt) {}

    public UserProfile getUserProfile() {}
    public void setUserProfile(UserProfile userProfile) {}
    public List<Address> getAddresses() {}
    public void setAddresses(List<Address> addresses) {}
    public void addAddress(Address address) {}
    public void removeAddress(Address address) {}

    public Client getClient() {}
    public void setClient(Client client) {}
    public Seller getSeller() {}
    public void setSeller(Seller seller) {}
    public Admin getAdmin() {}
    public void setAdmin(Admin admin) {}
    public CatalogManager getCatalogManager() {}
    public void setCatalogManager(CatalogManager catalogManager) {}

    public boolean isClient() {}
    public boolean isSeller() {}
    public boolean isAdmin() {}
    public boolean isCatalogManager() {}
    public Address getDefaultAddress() {}

    @Override
    public String toString() {}
}
```

```java name=UserProfile.java
import java.time.LocalDate;

public class UserProfile {
    private String id;
    private String userId;
    private String firstName;
    private String lastName;
    private String phone;
    private LocalDate dateOfBirth;

    private User user;

    public UserProfile() {}
    public UserProfile(String id, String userId, String firstName, String lastName,
                       String phone, LocalDate dateOfBirth) {}

    public String getId() {}
    public void setId(String id) {}
    public String getUserId() {}
    public void setUserId(String userId) {}
    public String getFirstName() {}
    public void setFirstName(String firstName) {}
    public String getLastName() {}
    public void setLastName(String lastName) {}
    public String getPhone() {}
    public void setPhone(String phone) {}
    public LocalDate getDateOfBirth() {}
    public void setDateOfBirth(LocalDate dateOfBirth) {}

    public User getUser() {}
    public void setUser(User user) {}

    public String getFullName() {}

    @Override
    public String toString() {}
}
```

```java name=Address.java
import java.util.List;

public class Address {
    private String id;
    private String userId;
    private String label;
    private String street;
    private String city;
    private String county;
    private String postalCode;
    private String country;
    private boolean isDefault;

    private User user;
    private List<Order> orders;
    private List<Locker> lockers;

    public Address() {}
    public Address(String id, String userId, String label, String street, String city,
                   String county, String postalCode, String country, boolean isDefault) {}

    public String getId() {}
    public void setId(String id) {}
    public String getUserId() {}
    public void setUserId(String userId) {}
    public String getLabel() {}
    public void setLabel(String label) {}
    public String getStreet() {}
    public void setStreet(String street) {}
    public String getCity() {}
    public void setCity(String city) {}
    public String getCounty() {}
    public void setCounty(String county) {}
    public String getPostalCode() {}
    public void setPostalCode(String postalCode) {}
    public String getCountry() {}
    public void setCountry(String country) {}
    public boolean isDefault() {}
    public void setDefault(boolean isDefault) {}

    public User getUser() {}
    public void setUser(User user) {}
    public List<Order> getOrders() {}
    public void setOrders(List<Order> orders) {}
    public List<Locker> getLockers() {}
    public void setLockers(List<Locker> lockers) {}

    public String getFormattedAddress() {}
    public void markAsDefault() {}
    public void unmarkAsDefault() {}

    @Override
    public String toString() {}
}
```

```java name=Shipment.java
import java.time.Instant;

public class Shipment {
    private String id;
    private String orderId;
    private String courierId;
    private String awbId;
    private Instant shippedAt;
    private Instant deliveredAt;
    private String shipmentStatusId;
    private String lockerId;

    private Order order;
    private Courier courier;
    private Awb awb;
    private ShipmentStatus shipmentStatus;
    private Locker locker;

    public Shipment() {}
    public Shipment(String id, String orderId, String courierId, String awbId,
                    String shipmentStatusId, String lockerId) {}

    public String getId() {}
    public void setId(String id) {}
    public String getOrderId() {}
    public void setOrderId(String orderId) {}
    public String getCourierId() {}
    public void setCourierId(String courierId) {}
    public String getAwbId() {}
    public void setAwbId(String awbId) {}
    public Instant getShippedAt() {}
    public void setShippedAt(Instant shippedAt) {}
    public Instant getDeliveredAt() {}
    public void setDeliveredAt(Instant deliveredAt) {}
    public String getShipmentStatusId() {}
    public void setShipmentStatusId(String shipmentStatusId) {}
    public String getLockerId() {}
    public void setLockerId(String lockerId) {}

    public Order getOrder() {}
    public void setOrder(Order order) {}
    public Courier getCourier() {}
    public void setCourier(Courier courier) {}
    public Awb getAwb() {}
    public void setAwb(Awb awb) {}
    public ShipmentStatus getShipmentStatus() {}
    public void setShipmentStatus(ShipmentStatus shipmentStatus) {}
    public Locker getLocker() {}
    public void setLocker(Locker locker) {}

    public boolean isDelivered() {}
    public boolean isShipped() {}
    public boolean isToLocker() {}
    public void markAsShipped() {}
    public void markAsDelivered() {}
    public String getTrackingUrl() {}

    @Override
    public String toString() {}
}
```

```java name=Courier.java
import java.util.List;

public class Courier {
    private String id;
    private String name;
    private String contactPhone;
    private String trackingUrl;

    private List<Shipment> shipments;

    public Courier() {}
    public Courier(String id, String name, String contactPhone, String trackingUrl) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getContactPhone() {}
    public void setContactPhone(String contactPhone) {}
    public String getTrackingUrl() {}
    public void setTrackingUrl(String trackingUrl) {}

    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    public String getTrackingUrlForAwb(String awbNumber) {}
    public int getShipmentCount() {}

    @Override
    public String toString() {}
}
```

```java name=Awb.java
import java.time.Instant;
import java.util.List;

public class Awb {
    private String id;
    private String number;
    private Instant createdAt;

    private List<Shipment> shipments;

    public Awb() {}
    public Awb(String id, String number) {}

    public String getId() {}
    public void setId(String id) {}
    public String getNumber() {}
    public void setNumber(String number) {}
    public Instant getCreatedAt() {}
    public void setCreatedAt(Instant createdAt) {}

    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    @Override
    public String toString() {}
}
```

```java name=ShipmentStatus.java
import java.util.List;

public class ShipmentStatus {
    private String id;
    private String name;
    private String description;
    private boolean isFinal;

    private List<Shipment> shipments;

    public ShipmentStatus() {}
    public ShipmentStatus(String id, String name, String description, boolean isFinal) {}

    public String getId() {}
    public void setId(String id) {}
    public String getName() {}
    public void setName(String name) {}
    public String getDescription() {}
    public void setDescription(String description) {}
    public boolean isFinal() {}
    public void setFinal(boolean isFinal) {}

    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    @Override
    public String toString() {}
}
```

```java name=Locker.java
import java.util.List;

public class Locker {
    private String id;
    private String addressId;
    private String name;
    private String type;

    private Address address;
    private List<Shipment> shipments;

    public Locker() {}
    public Locker(String id, String addressId, String name, String type) {}

    public String getId() {}
    public void setId(String id) {}
    public String getAddressId() {}
    public void setAddressId(String addressId) {}
    public String getName() {}
    public void setName(String name) {}
    public String getType() {}
    public void setType(String type) {}

    public Address getAddress() {}
    public void setAddress(Address address) {}
    public List<Shipment> getShipments() {}
    public void setShipments(List<Shipment> shipments) {}

    public String getFullLocation() {}

    @Override
    public String toString() {}
}
```
