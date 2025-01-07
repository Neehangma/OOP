// 3. Student Class
public class student {
    private String name;
    private String idNumber;
    private double gpa;
public static void main(String[] args) {
        student student1 = new student("John Doe", "123456", 3.5);
        student student2 = new student("Jane Doe", "654321", 3.8);
        student student3 = new student("James Smith", "987654", 3.2);
        student student4 = new student("Jill Smith", "456789", 3.9);
        student student5 = new student("Jack Johnson", "321654", 3.7);
        student student6 = new student("Jenny Johnson", "789123", 3.6);
        student student7 = new student("Jake Williams", "456123", 3.3);
        student student8 = new student("Jill Williams", "987321", 3.4);
        student student9 = new student("Jim Brown", "654789", 3.1);
        student student10 = new student("Jill Brown", "321987", 3.0);
}
    public student() {
        this.name = "";
        this.idNumber = "";
        this.gpa = 0.0;
}
    public student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }
}