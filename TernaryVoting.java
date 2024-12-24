import java.util.Scanner;

public class TernaryVoting {
    public static void main(String[] args) {
        Scanner c = new scanner(System.in);
        System.out.print("Enter your age: ");
        int age = c.nextInt();

        String result = (age > 18) ? "You can cast a vote." : "You cannot cast a vote.";
        System.out.println(result);
    }
}

