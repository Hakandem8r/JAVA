package Gun24;

import java.util.ArrayList;
import java.util.Scanner;

public class javaPrintAndFormat05 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> notlarArrList = new ArrayList<>();

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);

        notlarArrList.add(matNotlar);
        notlarArrList.add(turNotlar);
        notlarArrList.add(kimNotlar);

        //for (int i = 0; i < matNotlar.size(); i++) {
        //   System.out.println("matNotlar = " + matNotlar.get(i));

        /*System.out.println("notlarArrList = " + notlarArrList.size());
        for (int i = 0; i < notlarArrList.size(); i++) {
            //System.out.println("notlarArrList = " + notlarArrList.get(i));
            for (int j = 0; j < notlarArrList.get(i).size(); j++) {
                System.out.println("i. yapraktaki j. not = " + notlarArrList.get(i).get(j));

            }
        } */


    }

    public static int dersOrtalamaBul(int dersNo, ArrayList<ArrayList<Integer>> notlarArrList) {
        int toplam = 0;
        for (int i=0; i < notlarArrList.get(dersNo).size(); i++){
            toplam=toplam+notlarArrList.get(dersNo).get(i);
        }

        return toplam/notlarArrList.get(dersNo).size();

    }

}
