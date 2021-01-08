package Gun53.Ornekler.Ornek4;

public class Test implements IGoster,IYazdir {
    @Override
    public void goster() {
        System.out.println("göster");
    }
//İmplemet edilen interface'lerde aynı isim ve
//parametrede olan metodlardan bir tane yazmak yeterlidir.
    //Problem oluşturmaz
    @Override
    public void yaz() {
        System.out.println("göster yaz");
    }
}
