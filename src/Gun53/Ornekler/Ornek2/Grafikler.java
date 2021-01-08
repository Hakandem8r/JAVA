package Gun53.Ornekler.Ornek2;

public class Grafikler {
    public static void main(String[] args) {
        Cember cember=new Cember();
        Dikdortgen dikdortgen=new Dikdortgen();

        cember.ciz();
        dikdortgen.ciz();

        //Interface'lerden nesne üretilmez fakat referans tipi oluşturulabilir
        ICizilebilir cember2=new Cember();
        cember2.ciz();
    }
}
