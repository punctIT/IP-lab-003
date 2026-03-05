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