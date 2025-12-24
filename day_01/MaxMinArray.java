package day_01;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[], n, max, min, i;
        System.out.println("Enter the size of the array : ");
        n=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter an element : ");
            arr[i]=sc.nextInt();
        }
        max=min=arr[0];
        for(i=1;i<n;i++){
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
         for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Maximum element is : "+max);
        System.out.println("Minimum element is : "+min);
        sc.close();
    }
}