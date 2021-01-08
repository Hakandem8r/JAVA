package cumartesiMentoring04;

public class forEachSplit {
    public static void main(String[] args) {
        //TODO bir Scanner oluştur, tarih gir; ör. 19/08/2020 ve bu tarihteki / işaretlerine göre
        // split metodu uygulay:

        String str = new String("09/12/1996");

        System.out.println("Doğum günü: ");
        
        String[] array = str.split("/");
        
        for (String date : array){
            System.out.println("date = " + date);
        }
        
    }
}
