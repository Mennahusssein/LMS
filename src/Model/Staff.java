package Model;
public class Staff {
    private int staffId;
    private String name;
    private String contact;
    private static int counter =1;

    public Staff(String name, String contact){
        this.staffId=counter++;
        setName(name);
        setContact(contact);
    }
    public void setName(String name){
         if(name==null || name.isBlank()){
            throw new IllegalArgumentException("invalid name");
        }
        this.name=name;
    }
    public void setContact(String contact){
         if(contact==null || contact.isBlank() || !contact.matches("\\d{11}")){
            throw new IllegalArgumentException("Invalid contact number");
        }
        this.contact=contact;
    }
    public int getStaffId(){
        return staffId;
    }
    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
}
