import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        double num1 = getValue();
        double num2 = getValue();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Result: " + result);


    }

    public static double getValue() throws IOException {
        double num;
        System.out.println("Enter value: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String value = reader.readLine();
        try {
            num = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("Wrong format. Enter value: ");
            num = getValue();
        }
        return num;
    }

    public static char getOperation() throws IOException {
        char operation;

        System.out.println("Enter operation: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        operation = reader.readLine().charAt(0);
        return operation;
    }

    public static double calc(double num1, double num2, char operation) throws IOException {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

}
