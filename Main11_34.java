
package com.company;

public class Main11_34 {
    public static void main(String[] args) {
        int [] array = new int [30];
        System.out.println("Пункт а):");
        int first_june=0;
        int second_june=0;
        for (int i = 0; i < 30; i++) {
            array[i] = (int) (Math.random()*10);
            System.out.print(array[i] + " ");
            if (i<16){
                first_june=first_june+array[i];
            }
             else {
                second_june= second_june+array[i];
            }
        }
        if (first_june<second_june) {
            System.out.println("\n Осадков выпало больше во вторую половину июня");
        }
        else {
            System.out.println("\n Осадков выпало больше в первую половину июня");
        }
        int min=0;
        int z=0;
        System.out.println("Пункт б):");
        for (int k=1; k<=3; k++){
            int sum=0 ;
            for(int i=(1+10*(k-1));i<(10+10*(k-1));i++) {
                sum= sum+array[i];
            }
            if(sum>=min){
                min=sum;
                z=k;
            }
            System.out.println("\n Осадков за "+k+ "-ую декаду - "+ sum);

        }
        System.out.println(" Осадков больше всего выпало за "+z+ "-ую декаду - "+ min);




    }
}