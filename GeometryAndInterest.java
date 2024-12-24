import java.util.Scanner;

public class GeometryAndInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();
        System.out.println("Area of square: " + (side * side));
        System.out.println("Perimeter of square: " + (4 * side));

        // Simple Interest
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();
        System.out.println("Simple Interest: " + ((principal * rate * time) / 100));

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        System.out.println("Area of triangle: " + (0.5 * base * height));

        // Cube and Cuboid
        System.out.print("Enter side of cube: ");
        double cubeSide = sc.nextDouble();
        System.out.println("Volume of cube: " + (cubeSide * cubeSide * cubeSide));
        System.out.print("Enter length of cuboid: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of cuboid: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter height of cuboid: ");
        double cuboidHeight = sc.nextDouble();
        System.out.println("Volume of cuboid: " + (length * breadth * cuboidHeight));
    }
}
