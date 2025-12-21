package day_03;

import java.util.*;

public class count_freq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character to count: ");
        char targetChar = scanner.next().charAt(0);
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }
        System.out.println("Frequency of '" + targetChar + "' in the string: " + count);
        scanner.close();
    }
}
