package Gun28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ders01 {
    public static void main(String[] args) {
        //todo=>    add : Set icersinde bir eleman ekler
        //          clear : Set icerisndeki butun elemanlari siler.
        //          contains : Bir eleman dizi icinde mi kontrl eder.
        //          remove : bir eleman siler
        //          size : o ana kadar kac eleman ekledigini dondurur.
        //          isEmpty : bos olup olmadigini kontrol eder.
        //          containsAll : bellirli bir eleman , set icerisinde var mi yok mu bakiyor
        //          addAll : coklu islemler toplu ekleme baska bir kumeyi kumeye ekleme
        //          retainAll : iki kumenin kesisimini bulur
        //          removeAll : hepsini siler
        //          toArray : seti dizi haline getiriyor, dizi formatina cevirme

        // Setlerde tekraralayan eleman eklenemiyor, sen eklemeye çalışsan da o eklemeyecek

        //todo  =>  HashSet 3 ŞEKİLDE YAZILABİLİR
        HashSet<Integer> hs1=new HashSet<Integer>(); // Sadece Int alabilen bir Set tanımlandı
        Set<Integer> hs2=new HashSet<Integer>(); // Sadece Int alabilen bir Set tanımlandı
        Set<Integer> hs3=new HashSet<>(); // Sadece Int alabilen bir Set tanımladım -> Önerilen

        Set hsObject=new HashSet(); // Bu tanımlamada her türlü değişken atanabilir, bütün tipler
        // bütün tipleri kapsayan tipin adı : Object -> Nesne -> Her şeyin atası
        // Bu tanımlama diğerlerine göre yavaş çalışır ve farklı elemanlar atanabildiğinden
        // Tutarsız olabilir veriler, biraz kontrol dışı oluyor.
        // zorunlu değilsen kullanma
        hsObject.add("12");
        hsObject.add(12);


        Set<Integer> hs=new HashSet<>(); // Sadece Int alabilen bir Set tanımladım -> Önerilen
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        boolean eklendi_Mi = hs.add(5); // tekrar işleme girdi ama eklenmedi
        boolean eklendi_Mi2 = hs.add(7); // tekrar işleme girdi ama eklenmedi
        System.out.println("eklendi_Mi = " + eklendi_Mi);
        System.out.println("eklendi_Mi2 = " + eklendi_Mi2);

        //todo => 1.Yöntem yazdırma
        System.out.println("hs = " + hs); // hs = [1, 34, 3, 5, 7]
        // 1- Sırası neden böyle : HashSet hızlı çalışmak için, belli bir (hash) bir
        // algoritmaya göre sıraya dizdi.
        // 2- ikinci eklenen 5 ve 7 neden aklenemdi : Çünkü Setler tekrarları almaz.

        //todo => 2.Yöntem yazdırma, elemanlara tek tek ulaşma
        for(Integer eleman : hs)
        {
            System.out.println("eleman = " + eleman);
        }

        // todo => 3.Yöntem Iterator
        Iterator it= hs.iterator(); // hs nin başına konumlandı.
        while(it.hasNext())  // iteratörün konumlandığı yere göre sonrasında eleman var ise
        {
            Integer eleman = (Integer) it.next(); // göstergenin gösterdiği elemanı ver.tipi Obje
            System.out.println("it : eleman = " + eleman);
            // it.remove(); yazarak elemanı silebiliyorum. Bu hızlı silme işlemi yapabiliyor.

            if (eleman == 34)
                it.remove(); // Daha hızlı silme işlemi yapabiliyor.
        }

        System.out.println("it remove sonrası hs = " + hs);

        hs.remove(5); // Sadece 5 değerli elemanı siler.

        if (hs.contains(5)) // 5 değerinde eleman var mı
            System.out.println("5 var");
        else
            System.out.println("5 yok"); // burası çalıştı.çünkü silmiştik.

        hs.clear();
        System.out.println("Clear sonrası hs = " + hs);

        //todo => başlangıçta bir Set oluşturduk.  Bu setin içine '' add '' kullanarak ayrı ayrı
        // 5 tane integer değer atadık. Sonrasında boolean ile eklediğimiz integer değerlerin
        // olup olmadığını kontrol ettik.
        // I. Yazdırma Yöntemi:
        // özgür ve hızlı dediğimiz yöntem oldu,
        // sistem kendine uygun şekilde yazdırdı.
        // II. Yazdırma Yöntemi: foreach kullanarak ''hs''
        // isimli Set'i, Integer eleman'a atadık ve yazdırdık.
        // III. Yazdırma Yöntemi:
        // while ve iterator kullanarak, Set'in içinde bir sonra ki elemanın olup olmadığını
        // teyit ettik. Aynı zamanda Set'in içinde ki belli işlemleri kullandık

    }
}
