package org.example.nivell1.exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) throws BookAlreadyExistsException {
        if (books.contains(title)) {
            throw new BookAlreadyExistsException();
        }
        books.add(title);
        Collections.sort(books);
    }

    public List<String> getAllBooks() {
        return this.books;
    }

    public String getBookByPosition(int position) throws BookPositionDoesNotExistsException {
        if (position < 0 || position > books.size()) {
            throw new BookPositionDoesNotExistsException();
        }
            return books.get(position);
    }

    // verificar este metodo
    public void addBookAtSpecificPosition(int position, String title) throws BookAlreadyExistsException {
        if (books.contains(title) && !(position >= 0 && position <= books.size())) {
            throw new BookAlreadyExistsException();
        }
            books.add(position, title);
        Collections.sort(books);
    }

    public void deleteBook(String title) throws BookDoesNotExistsException {
        if(!books.contains(title)){
            throw new BookDoesNotExistsException();
        }
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
