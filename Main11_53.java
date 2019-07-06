package com.company;
import java.util.Scanner;
public class Main11_53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int N = in.nextInt();
        System.out.print("Введите m: ");
        int m = in.nextInt();
        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.println("Введите элементы массива:");
        int[] num = new int[N];
        int[] num1 = new int[N];
        int[] num2 = new int[N];
        for (int i = 0; i < N; i++) {   //вводим элементы в массив
            int a = in.nextInt();
            num[i] = a;
            num1[i]=a;
            num2[i]=a;
        }
        System.out.println("Пукт а): ");

        for (int l = 0; l < N; l++) {    //пункт а
            if (num[l] % 10 == 0) {
                num[l] = 0;
            }
                System.out.print(num[l]+" ");
            }
        System.out.println(" \n Пукт б): ");
        for (int j = 0; j < N; j++) {     //пункт б
            if (num1[j] % 2 != 0) {
                num1[j] = num1[j] * 2;
            } else {
                num1[j] = num1[j] / 2;
            }
            System.out.print(num1[j]+" ");
        }
        System.out.println("\n Пукт в): ");
        for (int v = 0; v < N; v++) {     //пункт с
            if (num2[v] % 2 != 0){
                num2[v] = num2[v]-m;
            }
            if (v%2!=0) {
                num2[v]=num2[v]+n;
            }
            System.out.print(num2[v]+" ");
        }

    }
}