package lesson1.homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 4 digit number: ");
        int number = sc.nextInt();

        int firstDigit = number % 10;
        int secondDigit = ((number % 100) / 10);
        int thirdDigit = ((number % 1000) / 100);
        int fourthDigit = (number / 1000);

        int firstLastNumber = ((firstDigit * 10) + fourthDigit);
        int secondThirdNumber = ((secondDigit * 10) + thirdDigit);


        if (firstLastNumber > secondThirdNumber) {
            System.out.println(firstLastNumber + " > " + secondThirdNumber);
            System.out.println(secondThirdNumber + " < " + firstLastNumber);

        } else if (firstLastNumber < secondThirdNumber) {
            System.out.println(firstLastNumber + " < " + secondThirdNumber);
            System.out.println(secondThirdNumber + " >" + firstLastNumber);
        }

    }
}
