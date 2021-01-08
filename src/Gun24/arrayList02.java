package Gun24;

import java.util.ArrayList;

public class arrayList02 {
    public static void main(String[] args) {
        int[] dizi=new int[]{2,3,4,5};

        ArrayList<String> list1=new ArrayList<>(){
            {
                add("Almanca"); //===> Bu şekilde de yazılabilir ama aşağıdaki daha fazla kullanılır.
                add("İngilizce");
                add("Türkçe");
                add("Rusça");
            }
        };
        System.out.println("list1 = " + list1);


        //TODO
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Rusça");
        list2.add("Türkçe");
        list2.add("Arapça");
        System.out.println("list2 = " + list2);

         // list1.removeAll(list2);
        // System.out.println("list1 = " + list1);

        //TODO Parantez içindeki listeyi, 1. listeye ekler:
        list1.addAll(list2);
        System.out.println("list1 = " + list1);

        //TODO eklenecek listeyi belirtilen indexten itibaren ekler:
        list1.addAll(2,list2);
        System.out.println("list1 = " + list1);

        if (list1.contains("Türkçe")){
            System.out.println("Türkçe dili var");
        }

        //indexOf, lastIndexOf, toArray aynı dizilerdeki gibi!!!






    }
}
