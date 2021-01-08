package Gun26;

import java.util.ArrayList;
import java.util.Collections;

public class soru01inAlternatifCozumu {
    public static void main(String[] args) {
        ArrayList<Integer> a  = new ArrayList<>();
        ArrayList<Integer> b  = new ArrayList<>();

        randomEkleVeOrtakElemaniBul(a,b);
        ortakElemanlariKaldir(a,b);
    }

    public static void randomEkleVeOrtakElemaniBul(ArrayList<Integer> a, ArrayList<Integer> b){
        for (int i = 0; i < 6 ; i++) {
            a.add((int)(Math.random()*51));
            b.add((int)(Math.random()*51));
        }
        ArrayList<Integer> ortak  = new ArrayList<>(a);

        Collections.sort(a);
        Collections.sort(b);
        System.out.println("a ilk hali: " + a);
        System.out.println("b ilk hali: " + b);
        ortak.retainAll(b);
        if (ortak.isEmpty())
            System.out.println("Ortak Eleman Yoktur...");
        else
            System.out.println("Ortak elemanlı yeni array: " + ortak);
    }

    public static void ortakElemanlariKaldir(ArrayList<Integer> a, ArrayList<Integer> b){
        if (a.removeAll(b))
            System.out.println("Ortak olanları çıkardıktan sonra Arraylist a: " + a);
    }
}
