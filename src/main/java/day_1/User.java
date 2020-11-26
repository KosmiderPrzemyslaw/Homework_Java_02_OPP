package day_1;

import day_2.Person;

import java.util.ArrayList;
import java.util.List;

public class User extends Person {
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

    List<Book> addBook(Book book) {
        bookList.add(book);
        return bookList;
    }

    public void returnBook(Book book) {

        book.setAvailable(true);
        for (Book b : this.bookList) {
            if (b.getId() == book.getId()) {
                bookList.remove(b);
                book.setCurrentUser(null);
            }
        }
    }

    public List<Book> getBookList() {
        return this.bookList;
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
