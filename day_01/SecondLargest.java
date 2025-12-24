package day_01;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[], n, max, max2;
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        max2 = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
            }
        }
        System.out.println("Second largest element is: " + max2);
        sc.close();
    }
}
