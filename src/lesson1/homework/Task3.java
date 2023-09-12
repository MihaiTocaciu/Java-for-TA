package lesson1.homework;
import java.util.Scanner;

public class Task3 {
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter d =");
        int d = sc.nextInt();

        System.out.println("Enter e =");
        int e = sc.nextInt();

        if (d < e) {
            System.out.println("Printing numbers in ascending order " + d + " " + e);
            System.out.println("Printing numbers in descending order " + e + " " + d);

        } else if (e < d) {
            System.out.println("Printing numbers in ascending order " + e + " " + d);
            System.out.println("Printing numbers in descending order " + d + " " + e);

        } else {
            System.out.println("Numbers are equal");
        }
    }
}