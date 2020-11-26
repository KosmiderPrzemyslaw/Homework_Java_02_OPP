package day_1;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private List<Book> bookList = new ArrayList<Book>();
    //private Book[] bookList;


    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String addBook(Book book) {
        bookList.add(book);
        return "book added";
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
