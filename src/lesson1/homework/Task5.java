package lesson1.homework;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time: ");
        int time = sc.nextInt();

        System.out.println("Enter Money: ");
        float Money = sc.nextFloat();

        System.out.println("Are you at work?");
        boolean AmIAtWork = sc.nextBoolean();

        if (AmIAtWork) {
            System.out.println("I am at work, won't be able to go out");

        } else if (!AmIAtWork && time < 20 && Money > 10) {
            System.out.println("Going to the cinema");

        } else if (!AmIAtWork && time < 20 && Money < 10) {
            System.out.println("Going for a walk");

        } else if (!AmIAtWork && time > 20 && Money > 20) {
            System.out.println("Going to a disco");

        } else if (!AmIAtWork && time > 20 && Money < 20) {
            System.out.println("Going to sleep");

        }


    }
}
