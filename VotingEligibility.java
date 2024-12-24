
    import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = c.nextInt();
        if (age > 18) {
            System.out.println("You can cast a vote.");
        } else {
            System.out.println("You cannot cast a vote.");
        }
    }

    
}

