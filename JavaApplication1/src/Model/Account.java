package Model;

public class Account {

    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String password;

    public Account(String firstName, String lastName, String email, String contact, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.password = password;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getContact() { return contact; }
    public String getPassword() { return password; }
}