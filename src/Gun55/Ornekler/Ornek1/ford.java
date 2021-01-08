package Gun55.Ornekler.Ornek1;

public class ford extends BinekOto{

    //abstract metod olduğundan zorunlu olarak
    //yazılmak zorunda (implemente edildi)
    @Override
    public String getMarka() {
        return "Ford Focus";
    }

    //abstract calss'daki yazılmış somut metodları
    //işler olduğu gibi kullanabiliriz.
    //istenirse override yapabiliriz


    @Override
    public int getUretimYili() {
        System.out.println(super.getUretimYili());
        return super.getUretimYili();
    }
}
