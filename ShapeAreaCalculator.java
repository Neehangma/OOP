import java.util.Scanner;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a shape: 1. Circle 2. Rectangle 3. Square 4. Triangle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle: " + (Math.PI * radius * radius));
                break;
            case 2:
                System.out.print("Enter length and width: ");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                System.out.println("Area of Rectangle: " + (length * width));
                break;
            case 3:
                System.out.print("Enter side length: ");
                double side = sc.nextDouble();
                System.out.println("Area of Square: " + (side * side));
                break;
            case 4:
                System.out.print("Enter base and height: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("Area of Triangle: " + (0.5 * base * height));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
