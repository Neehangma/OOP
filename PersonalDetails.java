import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        String rollNumber = sc.nextLine();
        System.out.print("Enter your field of interest: ");
        String field = sc.nextLine();
        
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + 
                           ". My field of interest is " + field + ".");
    }
}