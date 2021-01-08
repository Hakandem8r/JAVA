package cumartesiMentoring25Temmuz.BurakTryCatch;

public class Ornek1 {
    public static void main(String[] args) {


        System.out.println("Kodumuz çalışmaya başlıyor");
        int sayimiz=0;

        try {
            sayimiz=2/0;
            System.out.println("Bu string bu Try ın içindedir.");
        } catch (ArithmeticException bolmeHatasi){
            System.out.println(bolmeHatasi.getMessage());
        }


    }
}