package com.company;

import java.util.Scanner;

public class Main12_192 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива n,m: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Пункты а) и б): ");
        int q=a[0][0];
        int w=a[0][m-1];
        a[0][0]=a[n-1][0];
        a[n-1][0]=q;
        a[0][m-1]=a[n-1][m-1];
        a[n-1][m-1]=w;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
