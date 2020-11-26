package day_2;

import day_1.Author;
import day_1.Book;

public class SoundBook extends Book {
    private float duration;
    private int numberOfcarrieers;

    public SoundBook(int id, String title) {
        super(id, title);
    }

    public SoundBook(int id, String title, Author author, Author[] additionalAuthors) {
        super(id, title, author, additionalAuthors);
    }
}
