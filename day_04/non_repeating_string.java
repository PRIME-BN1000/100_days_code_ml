package day_04;

import java.util.*;

public class non_repeating_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String result = "";
        int len = input.length();
        for (int i = 0; i < len; i++) {
            char ch = input.charAt(i);
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                result = result + ch;
            }
        }
        System.out.println("The non-repeating characters are: " + result);
        scanner.close();
    }
}