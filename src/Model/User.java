package Model;
public class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private String contact;
    private String password;
   // private static int counterId =1;
    // constructor
    public User(String name, int age, String email, String contact, String password) {
       // this.id = counterId++;
        setName(name);
        setAge(age);
        setEmail(email);
        setContact(contact);
        setPassword(password);
    }

    // setters
    public void setId(int id){
        this.id=id;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.age = age;
    }

    public void setEmail(String email) {
        if ( email==null || email.isBlank() ||!email.contains("@") || !email.contains(".") ) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }

    public void setPassword(String password) {
        if ( password==null || password.isBlank() || password.length() < 6 ) {
            throw new IllegalArgumentException("Password must be at least 6 characters long");
        }
        if(!password.matches(".*[A-Za-z].*")){
            throw new IllegalArgumentException("Password must contain at least one letter");
        }
        this.password = password;
    }
    public void setContact(String contact){
        if(contact==null || !contact.matches("\\d{11}")){
            throw new IllegalArgumentException("Invalid contact number");
        }
        this.contact = contact;
    }

    // getters
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    public boolean checkPassword(String input){
    return this.password.equals(input);
}
    public String getContact(){
        return contact;
    }

}
