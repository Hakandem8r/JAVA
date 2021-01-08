package aaaExercises.Extends2;

public class Calisan {
    private String isim;
    double maas;
    int maasKatsayisi;

    public Calisan(String isim, double maas, int maasKatsayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }

    public double maasHesapla(){
        return this.maas*this.maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ismi='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
}
