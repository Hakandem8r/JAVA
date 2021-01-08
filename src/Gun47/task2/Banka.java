package Gun47.task2;

public class Banka {
    public static void main(String[] args) {
        //1- Bir Account sınıfı oluşturunuz, field ları number ve balance
        //2- bir constructor ekleyiniz.
        //3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
        //4- Account sınıfına withdraw (ParaCıkar) metodu ekleyiniz.
        //5- Withdraw a 5000 nin üzerine günlük limit dışına çıktınız uyarısı verelim
        //6- Main metodunda 2 account oluşturarak ihtimalleri deneyiniz
        try {
            Account account1 = new Account();
            account1.deposit(1000);
            System.out.println("account1.getBalance() = " + account1.getBalance());
            account1.withdraw(500);
            System.out.println("account1.getBalance() = " + account1.getBalance());
            //account1.balance=100000;
            System.out.println("account1.getBalance() = " + account1.getBalance());

            account1.withdraw(6000);

        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
    }
}