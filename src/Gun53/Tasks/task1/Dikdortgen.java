package Gun53.Tasks.task1;

public class Dikdortgen implements ISekil{
    @Override
    public int cevresi(int... dizi) {
        return (dizi[0]+dizi[1])*2;
    }

    @Override
    public int alani(int... dizi) {
        return dizi[0]*dizi[1];
    }
}
