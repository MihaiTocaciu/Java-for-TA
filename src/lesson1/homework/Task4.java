package lesson1.homework;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a=");
        int a = sc.nextInt();

        System.out.println("Enter b=");
        int b = sc.nextInt();

        System.out.println("Enter c=");
        int c = sc.nextInt();

        System.out.println("Numbers before swapping: " + a + " " + b + " " + c);

        int tmp = a;
        a = c;
        c = b;
        b = tmp;

        System.out.println("Swapped numbers: " + a + " " + b + " " + c);


    }
}


