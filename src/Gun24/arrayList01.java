package Gun24;

import java.util.ArrayList;

public class arrayList01 {
    public static void main(String[] args) {
        //Array: boyut sayısının belli olduğu ve değerlerin çok sık değiştirilmediği durumlarda
        //ArrayList:
        int[] dizi=new int[5]; //Array: Daha sonradan boyutu değiştirilemiyor.

        //ArrayList: Boyutu dinamik yani değişken ve değerlerin hızlı değişmesi durumunda daha hızlı.
        ArrayList<Integer> integerListe=new ArrayList<Integer>(); // TANIMLAMA
        ArrayList<Boolean> booleanListe=new ArrayList<Boolean>();
        ArrayList<String> stringListe=new ArrayList<>();//---> Bu taraftaki ara boş bırakılabilir!!!



        //String ArrayList tanımlaması
        ArrayList<String> isimler=new ArrayList<>();

        //1.TODO Eleman ekleme
        isimler.add("Ahmet");
        isimler.add("Ayşe");
        isimler.add("Kaya");
        System.out.println("isimler = " + isimler);


        //2.TODO belli bir indexe eleman ekleme, eklendiği indexten sonrakiler bir aşağı kayar
        isimler.add(1, "Zeynep");
        System.out.println("2-isimler = " + isimler);

        //3.TODO 2 nolu indexteki elemanı verir.
        String elemanAtIndex2= isimler.get(2);

        //4.TODO 0 indexteki elemanın değerini değiştir.
        isimler.set(0,"Deniz");
        System.out.println("3-isimler = " + isimler);

        //5.TODO Eleman sayısını verir , Array deki length
        int elemanSayisi = isimler.size();

        //6.TODO Listenin tamamen boş olup olmadığını verir.
        boolean listeBosMu=isimler.isEmpty();

        //7.TODO Eleman silme
        isimler.remove("Ayşe");
        System.out.println("4-isimler = " + isimler);
        isimler.remove(1);
        System.out.println("5-isimler = " + isimler);

        //8.TODO Bir elemanın indexini bulma
        int indexOfKaya = isimler.indexOf("Kaya");
        System.out.println("indexOfKaya = " + indexOfKaya);

        //9.TODO Tüm elemanları boşaltma
        isimler.clear();
        System.out.println("6-isimler = " + isimler);
    }
}

