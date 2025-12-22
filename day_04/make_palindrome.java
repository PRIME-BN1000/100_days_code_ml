package day_04;

import java.util.*;

public class make_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int l =input.length();
        String rev = "";
        for (int i = l - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        if (input.equals(rev)) {
            System.out.println("It is already a palindrome word.");
        } else {
            String palindrome = input + rev;
            System.out.println("The palindrome is: " + palindrome);
        }
    }
}