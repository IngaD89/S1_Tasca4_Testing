package org.example.nivell1.exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books);
        }
    }

    public List<String> getAllBooks() {
        return this.books;
    }

    public String getBookByPosition(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        }
        return null;
    }

    // verificar este metodo
    public void addBookAtSpecificPosition(int position, String title) {
        if (!books.contains(title) && position >= 0 && position <= books.size()) {
            books.add(position, title);
        }
        Collections.sort(books);
    }

    public void deleteBook(String title) {
        books.remove(title);
        Collections.sort(books);
    }

    public int getBookListSize() {
        return books.size();
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + this.books +
                '}';
    }
}
