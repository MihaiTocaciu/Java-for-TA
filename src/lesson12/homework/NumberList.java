package lesson12.homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


    public class NumberList {
        public static void main(String[] args) {

            ArrayList<Integer> numberList = new ArrayList<>();
            Random random = new Random();


            for (int i = 0; i < 20; i++) {
                int randomNumber = random.nextInt(5001); // 0 to 5000
                numberList.add(randomNumber);
            }


            System.out.println("Random numbers in the list: " + numberList);


            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to search: ");
            int searchNumber = sc.nextInt();


            if (numberList.contains(searchNumber)) {
                int index = numberList.indexOf(searchNumber);
                System.out.println("Number " + searchNumber + " is at index " + index + " in the list.");
            } else {
                System.out.println("Number " + searchNumber + " is not in the list.");
            }

            int min = numberList.get(0);
            int max = numberList.get(0);
            for (int number : numberList) {
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
            System.out.println("Minimum number in the list: " + min);
            System.out.println("Maximum number in the list: " + max);
        }
    }
