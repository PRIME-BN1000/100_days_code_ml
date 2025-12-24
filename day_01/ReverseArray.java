package day_01;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[], rev[], n;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        arr=new int[n];
        rev=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element :");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            rev[i]=arr[n-1-i];
        }
        System.out.print("Reversed array is: ");
        for(int i=0;i<n;i++)
            System.out.print(rev[i]+" ");
        sc.close();
    }
}
