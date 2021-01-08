package CumartesiMentoring15Agustos.Ornekler.Ornek1;

public class Ford extends BinekOto{

    @Override
    public String getMarka() {
        return "Ford focus";
    }

    @Override
    public int getUretimYili() {
        //System.out.println(super.getUretimYili() );
        return super.getUretimYili();
    }
}
