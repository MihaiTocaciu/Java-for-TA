package lesson1.homework;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number from 0-100: ");
        int a = sc.nextInt();

        if (a < 5) {
            System.out.println("Minimal chance of precipitation");

        } else if (a >= 5 && a < 20) {
            System.out.println("A small chance of precipitation");

        } else if (a >= 20 && a < 50) {
            System.out.println("There is a chance of precipitation");

        } else if (a >= 50 && a < 80) {
            System.out.println("High chance of precipitation");

        } else {
            System.out.println("It will rain");
        }
    }
}
