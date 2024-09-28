
public class Calculator {

    // Addition method
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division method
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Sample calculations
        System.out.println("Addition (5 + 3): " + calculator.add(5, 3));
        System.out.println("Subtraction (5 - 3): " + calculator.subtract(5, 3));
        System.out.println("Multiplication (5 * 3): " + calculator.multiply(5, 3));
        System.out.println("Division (6 / 2): " + calculator.divide(6, 2));
    }
}
