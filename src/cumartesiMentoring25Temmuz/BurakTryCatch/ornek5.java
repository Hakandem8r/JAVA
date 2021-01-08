package cumartesiMentoring25Temmuz.BurakTryCatch;

public class ornek5 {
    public static void main(String[] args) {
        System.out.println("Kodumuz başlatılıyor...");

        int a=0;

        try{
            a=2/0;
        } catch (Exception hata){
            hata.printStackTrace();
        }
        System.out.println("Bitiriliyor...");
    }
}
