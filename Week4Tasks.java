// 1. Program to print "Hello [name]" five times
import java.util.Scanner;

public class Week4Tasks {
    public static void main(String[] args) {
        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + name);
        }

        // Task 2
        System.out.println("\nMiles    Kilometers");
        for (int miles = 1; miles <= 10; miles++) {
            System.out.printf("%d    %.3f\n", miles, miles * 1.609);
        }

        // Task 3
        System.out.println("\nNumber    Square");
        for (int num = 10; num >= 1; num--) {
            System.out.println(num + "    " + (num * num));
        }

        // Task 4
        System.out.print("\nEnter the width for the square: ");
        int width = scanner.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Task 5
        char continueOption;
        do {
            System.out.print("\nEnter a positive non-zero integer: ");
            int number = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Sum of 1 to " + number + " is " + sum);
            System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
            continueOption = scanner.next().charAt(0);
        } while (continueOption == 'y');

        // Task 6
        System.out.print("\nEnter the width for the triangle: ");
        int triangleWidth = scanner.nextInt();
        for (int i = 1; i <= triangleWidth; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Task 7
        System.out.print("\nEnter two numbers to find their HCF: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int hcf = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);

        // Task 8
        System.out.print("\nEnter an integer to reverse: ");
        int input = scanner.nextInt();
        int reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;
        }
        System.out.println("Reversed number: " + reversed);

        // Task 9
        System.out.println("\nEnter 10 integers:");
        int greaterThan50 = 0, lessThan50 = 0, equalTo50 = 0;
        int sumGreater = 0, sumLess = 0;
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number > 50) {
                greaterThan50++;
                sumGreater += number;
            } else if (number < 50) {
                lessThan50++;
                sumLess += number;
            } else {
                equalTo50++;
            }
        }
        System.out.println("Numbers greater than 50: " + greaterThan50);
        System.out.println("Numbers less than 50: " + lessThan50);
        System.out.println("Numbers equal to 50: " + equalTo50);
        System.out.println("Average of numbers greater than 50: " + (greaterThan50 == 0 ? 0 : (double) sumGreater / greaterThan50));
        System.out.println("Average of numbers less than 50: " + (lessThan50 == 0 ? 0 : (double) sumLess / lessThan50));

        // Task 10
        System.out.print("\nEnter a positive non-zero integer to calculate sum: ");
        int positiveInt = scanner.nextInt();
        int totalSum = 0;
        for (int i = 1; i <= positiveInt; i++) {
            totalSum += i;
        }
        System.out.println("Sum of numbers from 1 to " + positiveInt + " is " + totalSum);

        scanner.close();
    }
}
