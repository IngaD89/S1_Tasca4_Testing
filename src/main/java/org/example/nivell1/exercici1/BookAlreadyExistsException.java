package org.example.nivell1.exercici1;

public class BookAlreadyExistsException extends Exception{
    public BookAlreadyExistsException() {
        super("Book already exists");
    }
}
