package Gun32.task.task2;

public class task2 {
    // 1.Adım  :ayrı dosyada olmak üzere Customer isimli (fields: name) isimli bir class tanımlayınız.
    //2.Adım  :ayrı bir dosyada ElectricityAccount isimli (fields : totalKw, rate(double), bill)
    //3.Adım  : Customer a bir ElectricityAccount ekleyiniz.
    //4. Adım  : 1 tane müşteri oluşturunuz, Account'u dahil;
    //5. Adım  : Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız
    //           tüketimle oluşan 

    public static void main(String[] args) {
        //4. adımda hem müşteriyi hem de elektrik aboneliğini oluşturduk
        Customer musteri1=new Customer();
        musteri1.name="Kaya";
        musteri1.elektrikAbonesi=new ElectricityAccount();
        
        musteri1.elektrikAbonesi.tuketimEkle(100); // Ocak ayı tüketim
        musteri1.elektrikAbonesi.tuketimEkle(150); // Şubat ayı tüketim
        System.out.println("musteri1.elektrikAbonesi.totalKw = " + musteri1.elektrikAbonesi.totalKw);

        System.out.println("musteri1.elektrikAbonesi.totalBill() = " + musteri1.elektrikAbonesi.totalBill());

        System.out.println("musteri1.elektrikAbonesi.bill = " + musteri1.elektrikAbonesi.bill);
        
    }
}
