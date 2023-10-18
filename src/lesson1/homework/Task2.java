package lesson1.homework;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a1 = ");
        int a1 = sc.nextInt();

        System.out.println("Enter b1 = ");
        int b1 = sc.nextInt();

        int sum = a1 + b1;
        int difference = a1 - b1;
        int product = a1 * b1;
        int remainder = a1 % b1;
        int division = a1 / b1;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Remainder = " + remainder);
        System.out.println("Division = " + division);


        System.out.println("Enter a2 = ");
        float a2 = sc.nextFloat();

        System.out.println("Enter b2 = ");
        float b2 = sc.nextFloat();

        float sum1 = a2 + b2;
        float difference1 = a2 - b2;
        float product1 = a2 * b2;
        float remainder1 = a2 % b2;
        float division1 = a2 / b2;

        System.out.println("Sum = " + sum1);
        System.out.println("Difference = " + difference1);
        System.out.println("Product = " + product1);
        System.out.println("Remainder = " + remainder1);
        System.out.println("Division = " + division1);
    }
}
