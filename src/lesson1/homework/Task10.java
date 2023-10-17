package lesson1.homework;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 0-24");
        int a = sc.nextInt();

        if (a >= 5 && a < 11) {
            System.out.println("Good morning");

        } else if (a >= 11 && a <= 18) {
            System.out.println("Good day");

        } else if (a >= 19 && a <= 23) {
            System.out.println("Good evening");

        } else if (a == 24 || a < 5) {
            System.out.println("Why aren't you sleeping?");
        }

    }
}
