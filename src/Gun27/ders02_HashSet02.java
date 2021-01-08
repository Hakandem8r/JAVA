package Gun27;

import java.util.HashSet;
import java.util.Iterator;

public class ders02_HashSet02 {
    public static void main(String[] args) {
        
        HashSet<String> hs=new HashSet<>();
        
        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Red"); //Bunu eklemedi
        hs.add("red");
        hs.add("rED");

        //1.Yol
        System.out.println("hs = " + hs);

        //2.Yol
        for (String s: hs){   //todo FOREACH KULLANABİLİRİZ!!!!!!!!!
            System.out.println("s = " + s);
        }
        //3.Yol
        Iterator gosterge=hs.iterator();
        while (gosterge.hasNext()){
            System.out.println("Sonraki eleman = " + gosterge.next());
        }
        //gosterge.remove(); // o anda gösterdiği elemanı silebilir

        hs.remove("Red"); // bir eleman siler
        System.out.println("hs = " + hs);

        hs.clear(); // Set i temizler
        System.out.println("hs = " + hs);
    }
}
