package Gun08;

public class trim {
    public static void main(String[] args) {
        //trim: stringin başında ve sonunda olan boşluk karakterlerini temizler

        String text = "  Merhaba Dünya  ";

        System.out.println("orjinal hali = ->" + text + "<-");
        System.out.println("baş ve sonundaki boşlukların temizlenmiş hali = " + text.trim());
    }
}
