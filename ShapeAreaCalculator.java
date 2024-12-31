import java.util.Scanner;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double area;
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + area);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                System.out.println("Area of the rectangle: " + area);
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                System.out.println("Area of the square: " + area);
                break;
            case 4:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of the triangle: " + area);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
