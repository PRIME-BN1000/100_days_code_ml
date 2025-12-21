package day_03;

import java.util.*;

public class max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][], r, c;
        System.out.print("Enter the number of rowws: ");
        r = sc.nextInt();
        System.out.print("Enter the number of columns: ");  
        c = sc.nextInt();
        a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the element : ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered array is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int max = a[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }

}
