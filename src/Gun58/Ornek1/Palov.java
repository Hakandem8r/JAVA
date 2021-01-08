package Gun58.Ornek1;

public class Palov implements IFood {
    void fry(){
        System.out.println("hafif kızarsın");
    }

    void boil(){
        System.out.println("iyi kaynat");
    }
    @Override
    public void taste() {
        System.out.println("tane tane, tereyağlı");
    }

    @Override
    public double ucret() {
        return 2.0;
    }
}
