package Service;

import java.util.ArrayList;

import Model.Book;
import Model.Staff;
import Model.User;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<Staff> staff;

    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
        staff = new ArrayList<>();
    }

    //BOOKS

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    //USER

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    //STAFF

    public void addStaff(Staff staffMember){
        staff.add(staffMember);
    }

    public void removeStaff(Staff staffMember){
        staff.remove(staffMember);
    }

    public ArrayList<Staff> getStaff(){
        return staff;
    }
}
