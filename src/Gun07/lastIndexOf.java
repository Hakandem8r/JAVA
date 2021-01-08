package Gun07;

public class lastIndexOf {
    public static void main(String[] args) {
        // String içinde aranan karakter(ler)in SONDAN İTİBAREN ilk indexini verir.
        // indexOf un sondan olan hali fakat index numaraları değişmez.

        String text = "Good";
        System.out.println("En sondaki o nun indexi = "+text.lastIndexOf("o"));
        System.out.println("ilk baştan o nun indexi = "+ text.indexOf("o"));

        String text2 = "ankara";
        System.out.println("En sondaki a'nın indexi = "+ text2.lastIndexOf("a"));
        System.out.println("ilk baştaki a'nın indexi = "+ text2.indexOf("a"));


    }
}
