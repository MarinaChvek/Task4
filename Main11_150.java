package com.company;
import java.util.Scanner;
public class Main11_150 {
    public static void main(String[] args) {
        int[] a = new int[20];
        int[] b = new int[19];
        final int w=20;
        System.out.print("Стоймости товаров в рублях: ");
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (Math.random() * 50);
            System.out.print(a[i] + " , ");
        }
        System.out.println("\n Введите номер товара, который нужно убрать из списка");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Элементы считаются начиная с нуля (0,1,2,3....)
        int j = 0;
        for (int i = n+1; i < w; i++) { //Создаем новый массив b и заполняем его элементами с номерами большими чем n
            j = j + 1;
            b[j] = a[i];
        }
        j = 0;
        for (int i = n; i < w-1; i++) {  //Присваиваем элементам старого массива значения элементов нового, таким образом удаляя элемент n-ый
            j = j + 1;
            a[i] = b[j];
        }
        System.out.print("Стоймость оставшихся товаров: ");
        for (int i = 0; i < w-1; i++) {
            System.out.print(a[i]+", ");
        }
    }
}