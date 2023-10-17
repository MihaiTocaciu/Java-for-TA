package lesson1.homework;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int c = a * b;
        System.out.println("a * b = " + c);

        if (c % 2 == 0) {
            System.out.println(c + " is even");

        } else {
            System.out.println(c + " is odd");

        }

        if (c % 3 == 0) {
            System.out.println(c + " is divisible by 3");

        } else {
            System.out.println(c + " is not divisible by 3");
        }
    }
}
