package Gun58.Ornek1;

public class AdanaKebap implements IFood {

    void marinade(){ System.out.println("Et dünden baharatla marine edildi"); }

    void grill(){
        System.out.println("Hafif ateşte pişti");
    }

    @Override
    public void taste() { System.out.println("Adana kebap mükemmel"); }

    @Override
    public double ucret() {
        return 5.0;
    }
}