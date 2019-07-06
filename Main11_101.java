package com.company;
import java.util.Scanner;
public class Main11_101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int N = in.nextInt();
        System.out.println("Введите элементы массива через пробел:");
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {   //вводим элементы в массив
            int a = in.nextInt();
            num[i] = a;

        }
        int d=0;
        for (int k=0;k<N-1;k++) {
            for (int w = k+1; w < N; w++) {
                if (num[w] == num[k]) {
                    d = d + 1;
                }
            }
            if (d==1) {
                break;
            }

        }
                if (d==1){
                    System.out.println("В массиве имеется только два одинаковых элемента");
                }
                else {
                    System.out.println("В массиве не имеется только двух одинаковых элемента");
                }
            }
        }


