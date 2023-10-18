package lesson12.homework;
import java.util.HashMap;
import java.util.Scanner;

 class Concordance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        HashMap<Character, StringBuilder> concordance = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);


            if (Character.isWhitespace(c)) {
                continue;
            }

            if (!concordance.containsKey(c)) {
                concordance.put(c, new StringBuilder("[" + i + "]"));
            } else {
                concordance.get(c).append(",[" + i + "]");
            }
        }

        System.out.println("Concordance:");

        for (char key : concordance.keySet()) {
            System.out.println(key + "=" + concordance.get(key).toString());
        }
    }
}
