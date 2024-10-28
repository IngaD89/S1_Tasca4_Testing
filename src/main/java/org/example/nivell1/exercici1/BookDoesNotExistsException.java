package org.example.nivell1.exercici1;

public class BookDoesNotExistsException extends Exception{
    public BookDoesNotExistsException() {
        super("Book does not exist");
    }
}
