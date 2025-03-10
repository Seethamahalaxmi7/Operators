import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two integer inputs
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Finding smaller and larger number
        if (num1 < num2) {
            System.out.println("Smaller number: " + num1);
            System.out.println("Larger number: " + num2);
        } else if (num1 > num2) {
            System.out.println("Smaller number: " + num2);
            System.out.println("Larger number: " + num1);
        } else {
            System.out.println("Both numbers are equal: " + num1);
        }

        scanner.close();
    }
}
