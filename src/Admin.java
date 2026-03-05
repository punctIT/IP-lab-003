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