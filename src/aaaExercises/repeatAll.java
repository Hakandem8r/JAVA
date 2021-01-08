package aaaExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class repeatAll {

    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(88);
        tekMiCiftMi(5149);
        tekMiCiftMi(546328);
        tekMiCiftMi(4796);
        topla(5, 6);
        topla(47, 88);
        mesaj("çirkinsin en azından iyi ve zeki ol!");

    }

    public static void mesaj(String tolstoy) {

    }

    public static void topla(int a, int b) {

        System.out.println("Toplam: " + (a + b));

    }


    public static void tekMiCiftMi(int sayi) {
        //int sayi=12;
        if (sayi % 2 == 1) {
            System.out.println("Tek");

        } else {
            System.out.println("Çift");
        }
    }
}



