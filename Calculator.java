import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
        int a,b;
        char op;

        Scanner scanner = new Scanner(System.in);
        // Take two numbers as input from the user
        System.out.println("Enter Two Integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        // Taking the operator as input from the user
        System.out.println("Enter an Operator (+,-,*,/): ");
        op = scanner.next().charAt(0);

        try {
            switch(op) {
                case'+':
                    // Perform addition and display the result
                    System.out.format("%d+%d = %d\n",a,b,(int) a+b);
                    break;
                case'-':
                    // Perform subtraction and display the result
                    System.out.format("%d-%d = %d\n",a,b,(int) a-b);
                    break;
                case'*':
                    // Perform multiplication and display the result
                    System.out.format("%d*%d = %d\n",a,b,(int) a*b);
                    break;
                case'/':
                    // Perform division and display the result
                    if (b != 0) {
                        System.out.format("%d/%d = %.2f\n",a,b,(float) a/b);
                    } else {
                        System.out.println("ERROR: Cannot divide by zero!");
                    }
                    break;
                default:
                    // Display an error message for unsupported operations
                    System.out.println("ERROR: Unsupported Operation");
            }
        } catch (Exception e) {
            System.out.println("ERROR: An exception occurred!");
        }

        // Display an message for Thank you
        System.out.println("Thank you for using the calculator!");

        scanner.close();
    }
}