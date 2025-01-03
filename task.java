public class task {
    // 1. Check if a number is prime
public static boolean isPrime(int number) {
    if (number <= 1) return false;
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) return false;
    }
    return true;
}

// 2. Check if a number is even
public static boolean isEven(int number) {
    return number % 2 == 0;
}

// 3. Print the table of a given number
public static void printTable(int n) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }
}

// 4. Multiply 3 numbers
public static int multiplyThreeNumbers(int a, int b, int c) {
    return a * b * c;
}

// 5. Calculate Simple Interest
public static void calculateSimpleInterest(double principal, double rate, double time) {
    double simpleInterest = (principal * rate * time) / 100;
    System.out.println("Simple Interest: " + simpleInterest);
}

// 6. Calculate the area of a rectangle
public static int calculateRectangleArea(int length, int width) {
    return length * width;
}

// 7. Calculate the factorial of a number
public static long factorial(int number) {
    if (number == 0) return 1;
    long result = 1;
    for (int i = 1; i <= number; i++) {
        result *= i;
    }
    return result;
}

// 8. Calculate the nth Fibonacci number
public static int fibonacci(int n) {
    if (n <= 1) return n;
    int a = 0, b = 1, sum;
    for (int i = 2; i <= n; i++) {
        sum = a + b;
        a = b;
        b = sum;
    }
    return b;
}

// 9. Find the greatest common divisor (GCD) of two numbers
public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// 10. Display all prime numbers less than a given number and count them
public static void printPrimeLessThan(int number) {
    int count = 0;
    for (int i = 2; i < number; i++) {
        if (isPrime(i)) {
            System.out.print(i + " ");
            count++;
        }
    }
    System.out.println("\nTotal prime numbers: " + count);
}

public static void main(String[] args) {
    // Test the methods
    System.out.println("Is 17 prime? " + isPrime(17));
    System.out.println("Is 20 even? " + isEven(20));
    printTable(5);
    System.out.println("Multiplication result: " + multiplyThreeNumbers(2, 3, 4));
    calculateSimpleInterest(1000, 5, 2);
    System.out.println("Rectangle Area: " + calculateRectangleArea(5, 10));
    System.out.println("Factorial of 5: " + factorial(5));
    System.out.println("5th Fibonacci number: " + fibonacci(5));
    System.out.println("GCD of 48 and 18: " + gcd(48, 18));
    printPrimeLessThan(30);
}
}
