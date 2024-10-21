package org.example.nivell1.exercici3;

public class ExceptionArray {
    public void noSuchIndex(int index){

        int[] numberArray = {1, 2, 3};

        if(index < 0 || index >= numberArray.length){
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }

}
