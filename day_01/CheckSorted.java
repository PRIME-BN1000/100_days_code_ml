package day_01;

import java.util.Scanner;

public class CheckSorted {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[], n, temp;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element : ");
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        for(int i=0; i<n; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
        if(isSorted==true) 
            System.out.println("The array is sorted in ascending order.");
         else {
            System.out.println("The array is not sorted in ascending order.");
            CheckSorted.sort(arr, n);
            for(int i=0; i<n; i++) 
                System.out.print(arr[i] + " ");
         }
    }
    public static void sort(int arr[], int n) {
        int temp;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}