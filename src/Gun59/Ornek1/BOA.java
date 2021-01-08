package Gun59.Ornek1;

public class BOA extends Bank{

    public BOA(String name, String phoneNUmber, String adress, int numEmployee) {
        super(name, phoneNUmber, adress, numEmployee);
    }

    @Override
    public void openAccount() {
        System.out.println("Adınız ve adres bilgileriniz alındı.");
        System.out.println(this.getClass().getSimpleName()+" Hesap açılışınız yapıldı.");
    }

    @Override
    public void closeAccount() {
        System.out.println("Hesap kapatma talebiniz alındı.");
        System.out.println(this.getClass().getSimpleName()+" daki hesabınız kapatıldı.");

    }
}
