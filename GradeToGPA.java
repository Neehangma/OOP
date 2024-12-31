import java.util.Scanner;

public class GradeToGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        double gpa;
        switch (grade) {
            case 'A':
                gpa = 4.0;
                break;
            case 'B':
                gpa = 3.0;
                break;
            case 'C':
                gpa = 2.0;
                break;
            case 'D':
                gpa = 1.0;
                break;
            case 'F':
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade.");
                return;
        }

        System.out.println("Your GPA is: " + gpa);
    }
}
