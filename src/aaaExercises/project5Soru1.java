package aaaExercises;

import java.util.Arrays;
import java.util.Scanner;

public class project5Soru1 {
    public static void main(String[] args) {
        int[] dizi=new int[5];
        for (int i=0; i<dizi.length; i++)
        {
            dizi[i]=(int)(Math.random()*10);
        }

        for (int i=0; i<dizi.length; i++)
        {
            System.out.println("dizi[i] = " + dizi[i]);
        }
        System.out.println("dizi[i] = "+Arrays.toString(dizi));

        //todo ****************************************************
        for (int value:dizi){
            System.out.println("value = " + value);
        }
    }
}
