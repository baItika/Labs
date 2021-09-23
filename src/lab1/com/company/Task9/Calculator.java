package lab1.com.company.Task9;

import java.util.Scanner;

public class Calculator {

    static double calculatorChange(double number1, double number2, char char1) throws Exception {
        double res = 0;
        switch (char1){
            case '+':
                return res = number1 + number2;
            case '-':
                return res = number1 - number2;
            case '*':
                return res = number1 * number2;
            case '/':
                return res = number1 / number2;
            default:
                System.out.println ("Invalid numbers, enter +, -,*, /");
                return res;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter number1: ");
        double number1 = scanner.nextDouble ();
        System.out.print("Enter number2: ");
        double number2 = scanner.nextDouble ();
        System.out.print("Enter operation(+,-,*,/): ");
        char char1 = (char) System.in.read ();

        System.out.println (calculatorChange(number1,number2,char1));
    }
}
