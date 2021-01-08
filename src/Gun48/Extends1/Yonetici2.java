package Gun48.Extends1;

public class Yonetici2 extends Personel {

    int bagliPersonelSayisi;
    double gorevTazminati;

    public void zamYap(int yuzde)
    {
        System.out.println(yuzde +
                " personele zam yapıldı.");
    }

    //Yönetici class da hepsini tek tek yaptık
    //Ama Yonetici2 class ta, miras yöntemi ile
    //daha kolay bir yöntem oldu.
    //Yönetici de bir personel olduğu için sadece Yöneticiye
   //eklenecekleri ekledik.
   //personel de yoneticinin kullanmayacagi bir degsiken
//  tanimlamak, inheritance yontemine engel degil


}
