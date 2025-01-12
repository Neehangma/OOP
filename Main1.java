// 1. Vehicle and Car Classes
class Vehicle {
    public void drive() {
        System.out.println("The vehicle is driving.");
    }
}

class Car extends Vehicle {
    public void display() {
        System.out.println("This is a car.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.display();
    }
}

// 2. Employee and HRManager Classes
class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000.00;
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }
}

