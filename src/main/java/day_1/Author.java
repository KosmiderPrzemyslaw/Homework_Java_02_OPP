package day_1;

public class Author {
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
