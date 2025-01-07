public // 1. Circle Class with Radius Attribute and Area, Circumference Calculation
class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}

// 2. Simple Interest Class with Principle, Time, and Rate Fields
class SimpleInterest {
    private double principle;
    private double time;
    private double rate;

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.setPrinciple(1000);
        si.setTime(2);
        si.setRate(5);

        System.out.println("Principle: " + si.getPrinciple());
        System.out.println("Time: " + si.getTime());
        System.out.println("Rate: " + si.getRate());
    }
}

// 3. Dog Class with Name and Breed Attributes
class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Beagle");

        // Modifying attributes using setters
        dog1.setName("Max");
        dog1.setBreed("Labrador");

        dog2.setName("Rocky");
        dog2.setBreed("Poodle");

        // Printing updated values
        System.out.println("Dog 1: Name - " + dog1.getName() + ", Breed - " + dog1.getBreed());
        System.out.println("Dog 2: Name - " + dog2.getName() + ", Breed - " + dog2.getBreed());
    }
}

// 4. Employee Class with Name, Job Title, and Salary Attributes
class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateUpdatedSalary(double incrementPercentage) {
        salary += salary * (incrementPercentage / 100);
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Software Engineer", 50000);

        System.out.println("Name: " + employee.name);
        System.out.println("Job Title: " + employee.jobTitle);
        System.out.println("Salary: " + employee.getSalary());

        employee.calculateUpdatedSalary(10);
        System.out.println("Updated Salary after 10% increment: " + employee.getSalary());
    }
}

    

