package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public long multiply(int a, int b) {
        return (long) a * b;
    }

    public double divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Divisor cannot be zero");
        return (double) a / (double) b;
    }

    public double modulus(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Modular cannot be zero");
        return a % b;
    }

    public double power(int base, int exp) {
        if (base == 0 && exp < 0)
            throw new IllegalArgumentException("Undefined for 0^(negative number)");

        long result = 1;
        boolean isNegativeExp = exp < 0;
        if (isNegativeExp)
            exp = -exp;
        for (int i = 0; i < exp; i++, result *= base) {
        }
        if (isNegativeExp)
            result = 1 / result;

        return result;
    }

    // Advanced operations

    // Calculate the greatest common divisor (GCD) of two numbers using the
    // Euclidean algorithm.
    public int gcd(int a, int b) {
        if (a == 0 && b == 0)
            throw new IllegalArgumentException("GCD(0, 0) is undefined");
        else if (b == 0)
            return a > 0 ? a : -a;
        else if (a == 0)
            return b > 0 ? b : -b;

        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Calculate the least common multiple (LCM) based on GCD
    public int lcm(int a, int b) {
        if (a == 0 || b == 0)
            throw new IllegalArgumentException("LCM(0, 0) is undefined");
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        return (a * b) / gcd(a, b);
    }

    // Calculate the Fibonacci value using recursion
    public long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci cannot be calculated for negative numbers");
        } else if (n == 1 || n == 0)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            System.out.println("Simple calculator.Calculator\nChoose an operation:");
            System.out.println("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division");
            System.out.println("5: Modulo\n6: Power\n7: GCD\n8: LCM\n9: Fibonacci\n0: Exit");
            System.out.print("Your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice > 0 && choice < 9) {
                    System.out.println("Enter two numbers:");
                    int numA = scanner.nextInt();
                    int numB = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("Result: " + cal.add(numA, numB));
                            break;
                        case 2:
                            System.out.println("Result: " + cal.subtract(numA, numB));
                            break;
                        case 3:
                            System.out.println("Result: " + cal.multiply(numA, numB));
                            break;
                        case 4:
                            System.out.println("Result: " + cal.divide(numA, numB));
                            break;
                        case 5:
                            System.out.println("Result: " + cal.modulus(numA, numB));
                            break;
                        case 6:
                            System.out.println("Result: " + cal.power(numA, numB));
                            break;
                        case 7:
                            System.out.println("GCD: " + cal.gcd(numA, numB));
                            break;
                        case 8:
                            System.out.println("LCM: " + cal.lcm(numA, numB));
                            break;
                    }
                } else if (choice == 9) {
                    System.out.println("Enter an integer:");
                    int fibN = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Fibonacci value: " + cal.fibonacci(fibN));
                } else if (choice == 0) {
                    break;
                } else {
                    System.out.println("Invalid choice!");
                }
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number in range -2,147,483,648 and 2,147,483,647");
                scanner.nextLine();
            }

            // scanner.nextLine();
            System.out.println("Do you want to continue? (Y/N)");
            String out = scanner.nextLine().toLowerCase();
            if (out.equals("n")) {
                break;
            }
        }
        System.out.println("Thanks for using");

        scanner.close();
    }
}
