import java.util.Scanner;

public class GradeToGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grade (A, B, C, D, F): ");
        char grade = sc.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("GPA: 4.0");
                break;
            case 'B':
                System.out.println("GPA: 3.0");
                break;
            case 'C':
                System.out.println("GPA: 2.0");
                break;
            case 'D':
                System.out.println("GPA: 1.0");
                break;
            case 'F':
                System.out.println("GPA: 0.0");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
