package day_1;

import java.util.Arrays;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private boolean available = true;
    private Author author;
    private Author[] additionalAuthors;
    private User currentUser;
    private int popularity = 0;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        available = false;
        popularity++;
        currentUser.addBook(this);
    }

    Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, Author author, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public boolean equals(Book book) {
        int bookId = book.getId();
        return id == bookId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", available=" + available +
                ", author=" + author +
                ", additionalAuthors=" + Arrays.toString(additionalAuthors) +
                '}';
    }
}
