package org.example.nivell1.exercici2;

public class CalculateDNI {

    public char CalculateDniLetter(int dniNum){
        int rest;
        char letter = ' ';

        char[] letters = new char[] {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        rest = dniNum % 23;

        for (int i = 0; i < letters.length; i++){
            if(rest == i){
                letter = letters[i];
                System.out.println("Letra correcta es " + letter);
            }
        }
        return letter;
    }

}
