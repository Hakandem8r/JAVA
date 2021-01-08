package Gun09;

public class javaBölme {
    public static void main(String[] args) {
        int a=10;
        int b=3;

        System.out.println("a/b = " + (a/b)); // int 2 sayının bölüm sonu tam sayıdır. ->3
        System.out.println("a/b = " + ((double)a/b)); // ondalıklı sonuç istiyorsak
        // değişkenlerden birini double veya float'a çeviriririz. 1 tanesi yeterli
        // double hassasiyeti 15 hane
        System.out.println("a/b = " + ((float)a/b)); // hassasiyet 7 hane

        double c=3.14;
        double d=2.1;
        System.out.println("c/d = " + (c/d)); // zaten sayıların double olduğu sonuç double olacaktır.


    }
}
