import java.util.Scanner;

public class sumandproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Product: " + (num1 * num2));
    }
}
