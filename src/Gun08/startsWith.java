package Gun08;

import java.sql.SQLOutput;

public class startsWith {
    public static void main(String[] args) {
        
        String text = "Merhaba Dünya";

        System.out.println("ME ile başlıyor mu? = " + text.startsWith("ME"));
        System.out.println("Me ile başlıyor mu? = " + text.startsWith("Me"));
        System.out.println("M ile başlıyor mu? = " + text.startsWith("M"));
        System.out.println("k ile başlıyor mu? = " + text.startsWith("k"));
        System.out.println("text = " + text);
    }
}
