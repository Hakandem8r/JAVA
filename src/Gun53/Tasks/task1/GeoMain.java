package Gun53.Tasks.task1;

public class GeoMain {
    public static void main(String[] args) {
        Dikdortgen dd=new Dikdortgen();
        System.out.println("dd.alani = " + dd.alani(4,5));
        System.out.println("dd.cevresi = " + dd.cevresi(4,5));
        
        Cember cem=new Cember();
        System.out.println("cem.alani = " + cem.alani(5));
        System.out.println("cem.cevresi(5) = " + cem.cevresi(5));

        Kare kare=new Kare();
        System.out.println("kare.alan = " + kare.alani(4,4));
        System.out.println("kare.cevresi(4) = " + kare.cevresi(4));
    }
}
