package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int result;
        int numA = 0;
        int numB = 0;
        try {
            System.out.println("Введите первое число: ");
            numA = scanner.nextInt();
            System.out.println("Введите второе число: ");
            numB = scanner.nextInt();
            System.out.println("Введите действие в формате '+', '-', '/', или '*' ");
            answer = scanner.next();
        } catch (InputMismatchException e){
            System.out.println("Введены неправильные значения.");
        }
        try {
            switch (answer) {
                case "+" -> {
                    result = sumTesting(numA, numB);
                    System.out.println("Ответ: " + numA + " " + answer + " " + numB + " = " + result);
                }
                case "-" -> {
                    result = minusTesting(numA, numB);
                    System.out.println("Ответ: " + numA + " " + answer + " " + numB + " = " + result);
                }
                case "/" -> {
                    result = divideTesting(numA, numB);
                    System.out.println("Ответ: " + numA + " " + answer + " " + numB + " = " + result);
                }
                case "*" -> {
                    result = multiplyTesting(numA, numB);
                    System.out.println("Ответ: " + numA + " " + answer + " " + numB + " = " + result);
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль.");
        }


    }

    public static int sumTesting(int two, int three) {
        return two + three;
    }

    public static int minusTesting(int five, int six) {
        return five - six;
    }

    public static int divideTesting(int eight, int nine) {
        return eight / nine;
    }

    public static int multiplyTesting(int eleven, int twelve) {
        return eleven * twelve;
    }
}
