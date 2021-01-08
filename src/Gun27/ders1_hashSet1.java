package Gun27;

import java.util.ArrayList;
import java.util.HashSet;

public class ders1_hashSet1 {
    public static void main(String[] args) {
        // Array => ArrayList -> Set?
        //Collections : Koleksiyonlar
        //HashSet : Kendine göre bir algoritma ile saklıyor
        //LinkedHashSet => Kullanıcının ekleme sırasına göre saklıyor
        // TreeSet => Her veri girildiğinde tüm verileri küçükten büyüğe olacak şekilde sıralayarak saklıyor
        //Avantajı: aynı elemanı 2 kez eklemiyor!!!
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        System.out.println("list = " + list);

       // Set<Integer> hs=new HashSet<>();
        HashSet<Integer> hs=new HashSet<>();
        boolean eklendiMi_1 = hs.add(1);// true
        boolean eklendiMi_2 = hs.add(2);//true
        boolean eklendiMi_3 = hs.add(3);//true
        boolean eklendiMi_4 = hs.add(3);//daha önce eklendiği için eklenmeyecek, sonuç false
        boolean eklendiMi_5 = hs.add(2);//daha önce eklendiği için eklenmeyecek, sonuç false

        System.out.println("eklendiMi_5 = " + eklendiMi_5);

        System.out.println("hs = " + hs);
        
    }
}
