package Gun07;

public class subString {
    public static void main(String[] args) {
        // Substring : string'in belli bir bölümünü alma işlemi!

        String text = "Merhaba arkadaşlar";
        System.out.println("1.Bölüm = "+ text.substring(1,5)); // 1 nolu index'ten 5'e kadar alır, 5 dahil değil.
        System.out.println("2. Bölüm = "+ text.substring(0,3));
        System.out.println("3üzel. Bölüm = "+ text.substring(4)); // verilen index'ten itibaren sonuna kadar alır.

        String strAlinan = text.substring(0,3); // bu şekilde alınan parça atanabilir!
        System.out.println("........................................");
        String str = "Çay güzeldir";
        System.out.println("str.substring(5) = " + str.substring(5,9));


    }
}
