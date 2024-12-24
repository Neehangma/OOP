import java.util.Scanner;

public class AreaAndVolume {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        // Triangle Area
        System.out.print("Enter base and height of the triangle: ");
        double base = c.nextDouble();
        double height = sc.nextDouble();
        double areaOfTriangle = 0.5 * base * height;

        // Volume of Cube
        System.out.print("Enter side of the cube: ");
        double side = sc.nextDouble();
        double volumeOfCube = Math.pow(side, 3);

        // Volume of Cuboid
        System.out.print("Enter length, width, and height of the cuboid: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double cuboidHeight = sc.nextDouble();
        double volumeOfCuboid = length * width * cuboidHeight;

        System.out.println("Area of Triangle = " + areaOfTriangle);
        System.out.println("Volume of Cube = " + volumeOfCube);
        System.out.println("Volume of Cuboid = " + volumeOfCuboid);
    }
}
