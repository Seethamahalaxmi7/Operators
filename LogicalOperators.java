import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first boolean value (true/false): ");
        boolean a = scanner.nextBoolean();

        System.out.print("Enter second boolean value (true/false): ");
        boolean b = scanner.nextBoolean();


        boolean andResult = a && b;
        System.out.println("Logical AND (" + a + " && " + b + ") = " + andResult);


        boolean orResult = a || b;
        System.out.println("Logical OR (" + a + " || " + b + ") = " + orResult);

        boolean notA = !a;
        boolean notB = !b;
        System.out.println("Logical NOT (!" + a + ") = " + notA);
        System.out.println("Logical NOT (!" + b + ") = " + notB);

        scanner.close();
    }
}
