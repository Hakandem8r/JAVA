package cumartesiMentoring04;

public class forEach {
    public static void main(String[] args) {
        //TODO-------for each loop-------for each döngüsü => hem kodun daha hızlı
        //ve doğru çalışmasını sağlar


        String[] StringArrayi = {"Monitör", "Klavye", "Fare"};

        for (String yeniString : StringArrayi){
            System.out.println("yeniString = " + yeniString);
        }
    }
}
