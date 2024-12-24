import java.util.Scanner;

public class MarksClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        int marks1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int marks2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int marks3 = sc.nextInt();
        System.out.print("Enter marks for subject 4: ");
        int marks4 = sc.nextInt();

        int totalMarks = marks1 + marks2 + marks3 + marks4;
        double percentage = totalMarks / 4.0;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        String result = (percentage >= 70) ? "First Class" :
                        (percentage > 59) ? "Upper Second Class" :
                        (percentage > 49) ? "Second Class" :
                        (percentage > 39) ? "Third Class" : "Fail";

        System.out.println("Result: " + result);
    }
}
