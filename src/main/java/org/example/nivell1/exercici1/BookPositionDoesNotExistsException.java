package org.example.nivell1.exercici1;

public class BookPositionDoesNotExistsException extends Exception{
    public BookPositionDoesNotExistsException() {
        super("Book on this position does not exist");
    }
}
