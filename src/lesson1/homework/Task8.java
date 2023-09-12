package lesson1.homework;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3 digit number without the digit 0: ");
        int a = sc.nextInt();
        int b = (a % 1000) / 100;
        int c = (a % 100) / 10;
        int d = a % 10;

        if (a % b == 0 && a % c == 0 && a % d == 0) {
            System.out.println(+a + " Is divisible to all of its digits");

        } else {
            System.out.println(a + " Is not divisible to all of its digits");
        }

    }
}
