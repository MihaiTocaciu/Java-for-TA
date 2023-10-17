package lesson1.homework;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ebter a three digit number:");
        int a = sc.nextInt();

        int b = (a % 1000) / 100;
        int c = (a % 100) / 10;
        int d = a % 10;

        if (b == c && c == d) {
            System.out.println("The numbers are equal");

        } else if (b > c && c > d) {
            System.out.println("Descending order");

        } else if (b < c && c < d) {
            System.out.println("Ascending order");

        } else {
            System.out.println("Try with another number");
        }


    }
}
