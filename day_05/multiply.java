package day_05;

import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int result = mul(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);
        scanner.close();
    }

    public static int mul(int a, int b) {
        if (a==0 || b == 0) {
            return 0;
        } else if (b > 0) {
            return a + mul(a, b - 1);
        } else {
            return -mul(a, -b);
        }
    }
}
