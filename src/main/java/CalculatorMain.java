import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int num1 = getValue();
        int num2 = getValue();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    public static int getValue() throws IOException {
        int num;
        System.out.println("Enter value: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String value = reader.readLine();
        try {
            num = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Wrong format. Enter value: ");
            num = getValue();
        }
        return num;
    }

    public static char getOperation() throws IOException {
        char operation;

        System.out.println("Enter hierarchy.operation: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        operation = reader.readLine().charAt(0);
        return operation;
    }

    public static int calc(int num1, int num2, char operation) throws IOException {
        int result;
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
                break;
        }
        return result;
    }
}