package day_05;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        factorial obj = new factorial();
        int fac = obj.calfactorial(n);
        System.out.println("Factorial of " + n + " is: " + fac);
        scanner.close();
    }

    public int calfactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calfactorial(n - 1);
        }
    }
}
