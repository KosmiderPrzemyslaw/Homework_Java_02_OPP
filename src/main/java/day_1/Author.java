package day_1;

import day_2.Person;

public class Author extends Person {
    private int id;
    private String authorName;
    private String lastName;
    private String pseudonym;

    public Author(int id, String authorName, String lastName, String pseudonym) {
        this.id = id;
        this.authorName = authorName;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                '}';
    }
}
