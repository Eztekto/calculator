package Calculator;

import java.security.AlgorithmConstraints;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = "";
        int result;
        int numA = 0;
        int numB = 0;
        try {
            System.out.println("Введите первое число: ");
            numA = scanner.nextInt();
            System.out.println("Введите второе число: ");
            numB = scanner.nextInt();
            System.out.println("Введите действие в формате '+', '-', '/', или '*' ");
            operation = scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Введены неправильные значения.");
        }
        try {
            switch (operation) {
                case "+" -> {
                    result = sumTesting(numA, numB);
                    System.out.println("Ответ: " + numA + " " + operation + " " + numB + " = " + result);
                }
                case "-" -> {
                    result = minusTesting(numA, numB);
                    System.out.println("Ответ: " + numA + " " + operation + " " + numB + " = " + result);
                }
                case "/" -> {
                    result = divideTesting(numA, numB);
                    System.out.println("Ответ: " + numA + " " + operation + " " + numB + " = " + result);
                }
                case "*" -> {
                    result = multiplyTesting(numA, numB);
                    System.out.println("Ответ: " + numA + " " + operation + " " + numB + " = " + result);
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка:" + e);
        }


    }

    public static int sumTesting(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static int minusTesting(int five, int six) {
        return five - six;
    }

    public static int divideTesting(int eight, int nine) {
        try {
            return eight / nine;
        } catch(ArithmeticException e) {
            throw new ArithmeticException("Нельзя делить на ноль. " + e);
        }

    }

    public static int multiplyTesting ( int eleven, int twelve){
        return eleven * twelve;
    }
}

