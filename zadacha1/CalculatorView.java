package zadacha1;

import java.util.Scanner;

public class CalculatorView {

    public double userInputOne() {
        double number1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        if (sc.hasNextDouble()) {
            number1 = sc.nextInt();
        }else {
            throw new Error("Введите число!");
        }
        return number1;
    }
    public double userInputTwo() {
        double number2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        if (sc.hasNextDouble()) {
            number2 = sc.nextInt();
        }else {
            throw new Error("Введите число!");
        }
        return number2;
    }
    public String userInputOp() {
        String operator = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите математический символ: ");
        if (sc.hasNextLine()) {
            operator = sc.nextLine();
        }
        return operator;
    }
    public void printResult(double result) {
        System.out.printf("Результат: " + result);
    }
    public void printError(String fallacy) {
        System.out.println("Ошибка: " + fallacy);
    }
}