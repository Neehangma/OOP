public class Main3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        Square square = new Square(4);
        Circle circle = new Circle(3);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}

// 4. Vehicle Hierarchy with Car and Motorcycle
class Vehicle2 {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car2 extends Vehicle2 {
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class Motorcycle extends Vehicle2 {
    public void ride() {
        System.out.println("Motorcycle is riding.");
    }
}