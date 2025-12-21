package day_03;

import java.util.*;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter the number of rows : ");
        m = obj.nextInt();
        System.out.println("Enter the number of columns : ");
        n = obj.nextInt();
        int a[][] = new int[m][n];
        for(i=0;i<m;i++) {
            for(j=0;j<n;j++) {
                System.out.println("Enter the element : ");
                a[i][j] = obj.nextInt();
            }
        }
        int b[][] = new int[m][n];
        System.out.println("Enter the elements of second matrix : ");
        for(i=0;i<m;i++) {
            for(j=0;j<n;j++) {
                System.out.println("Enter the element : ");
                b[i][j] = obj.nextInt();
            }
        }
        int c[][] = multiply(a,b,m,n);
        System.out.println("The resultant matrix is : ");
        for(i=0;i<m;i++) {
            for(j=0;j<n;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] multiply(int a[][], int b[][], int m, int n) {
        int c[][] = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                c[i][j] = 0;
                for(int k=0;k<n;k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
