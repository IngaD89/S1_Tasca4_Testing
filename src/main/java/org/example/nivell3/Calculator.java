package org.example.nivell3;

public class Calculator {
    private double number1;
    private double number2;
    private double result;

    public Calculator(){}

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
        result = 0;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double addition(double num1, double num2){
        this.result = num1 + num2;
        return result;
    }

    public double subtraction(double num1, double num2){
        this.result = num1 - num2;
        return this.result;
    }

    public double multiplication(double num1, double num2) {
        this.result = num1 * num2;
        return result;
    }

    public double division(double num1, double num2) {
        if(num1 == 0 || num2 == 0){
            throw new ArithmeticException("No se permite dividir entre cero");
        }
        this.result = num1 / num2;
        return result;
    }
}
