package Gun55.Ornekler.Ornek3;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava baklava=new Baklava();
        baklava.madeIn();
        baklava.taste();

        CheeseCake cc=new CheeseCake();
        cc.madeIn();
        cc.taste();

        GreekSalad greekSalad=new GreekSalad();
        greekSalad.madeIn();
        greekSalad.taste();
    }
}
