package lesson1.homework;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a = ");
        double a = sc.nextDouble();

        System.out.println("Enter b = ");
        double b = sc.nextDouble();

        System.out.println("Enter c = ");
        double c = sc.nextDouble();

        if (a < c && b > c) {
            System.out.println("Number " + c + " is between " + a + " and " + b);

        } else {
            System.out.println("Number C is not between number A and B");
        }
    }
}











