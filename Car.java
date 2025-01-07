// 5. Car Class
public class Car {
    private String make;
    private String model;
    private double rentalPricePerDay;
    private boolean isAvailable;
public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 50.00);
        Car car2 = new Car("Honda", "Civic", 60.00);
        Car car3 = new Car("Ford", "Fusion", 70.00);
        Car car4 = new Car("Chevrolet", "Malibu", 80.00);
        Car car5 = new Car("Nissan", "Altima", 90.00);
        Car car6 = new Car("Hyundai", "Elantra", 100.00);
        Car car7 = new Car("Kia", "Forte", 110.00);
        Car car8 = new Car("Volkswagen", "Jetta", 120.00);
        Car car9 = new Car("Subaru", "Impreza", 130.00);
        Car car10 = new Car("Mazda", "Mazda3", 140.00);
        car1.rentCar();
        car1.rentCar();
        car1.returnCar();
        car1.rentCar();
        car1.returnCar();
        car1.returnCar();
}
    public Car() {
        this.make = "";
        this.model = "";
        this.rentalPricePerDay = 0.0;
        this.isAvailable = false;
}
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The car has been rented.");
        } else {
            System.out.println("The car is already rented.");
        }
    }

    public void returnCar() {
        isAvailable = true;
        System.out.println("The car has been returned.");
    }
}
