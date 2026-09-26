import java.util.Scanner;

public class IT26101296Lab9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else {
            System.out.println("The roots are complex numbers (no real solution).");
        }

        scanner.close();
    }
}