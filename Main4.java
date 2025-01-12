public class Main4 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        Motorcycle motorcycle = new Motorcycle();

        car.startEngine();
        car.drive();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.ride();
        motorcycle.stopEngine();
    }
}

// 5. Shape Hierarchy with Rectangle and Circle
class Shape2 {
    public double calculateArea() {
        return 0;
    }
}

class Rectangle2 extends Shape2 {
    double length;
    double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle2 extends Shape2 {
    double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}