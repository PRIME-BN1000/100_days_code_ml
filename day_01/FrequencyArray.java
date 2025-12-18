package day_01;

import java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[], freq[], n, count;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        freq = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element : ");
            arr[i] = sc.nextInt();
            freq[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = 0;
                }
            }
            if (freq[i] != 0) {
                freq[i] = count;
            }
        }
        System.out.println("Element\tFrequency");
        for (int i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println(arr[i] + "\t" + freq[i]);
            }
        }
    }
}