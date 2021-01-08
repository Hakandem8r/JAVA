package Gun56.Ornek2;

public class Kartal extends Hayvan {
    @Override
    void yiyecegi() {
        System.out.println("et");
    }

    @Override
    void yemekMiktari() {
        System.out.println("her gün 1 kuş yer");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("tokken uyur");
    }

    @Override
    void sesi() {
        System.out.println("ciyak");
    }
}
