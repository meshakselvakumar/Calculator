import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Prompt the user for the operation
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result;
        
        // Perform the calculation based on the user's choice
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
                
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
                
            default:
                System.out.println("Invalid operation. Please try again.");
                break;
        }
        
        // Close the scanner
        scanner.close();
    }
}
