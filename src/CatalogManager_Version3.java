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