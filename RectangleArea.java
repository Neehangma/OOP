import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        
        int area = (int) (length * breadth);
        System.out.println("Area of rectangle (type casted to int): " + area);
    }
}
