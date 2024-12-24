import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;
        int product = num1 * num2;
        
        if (product != 0) {
            double division = (double) sum / product;
            System.out.println("Division of sum and product: " + division);
        } else {
            System.out.println("Product is zero, division not possible.");
        }
    }
}
