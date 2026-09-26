import java.util.Scanner;

public class IT26101296Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s%-15.2f%-10c\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("--- Enter details for Student " + (i + 1) + " ---");
            
            System.out.print("Enter Name: ");
            names[i] = scanner.nextLine();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();
            scanner.nextLine(); // Clear buffer

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        System.out.println("\n%-15s%-15s%-10s".formatted("Name", "Final Mark", "Grade"));
        System.out.println("----------------------------------------");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}