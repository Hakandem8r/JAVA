package Gun59.Ornek1;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
//Kullanıcıya hangi bankada hesap açmak istediğini sorup bir menü ile
//hesabı açınız.
//sonra kullanıcıya yine bir menü ile para yatırma ve çekme işlemi yaptırınız.
//en son bankanın bakiyesini (balance) ını yazınız.

        System.out.println("Hangi bankada hesap açmak istiyorsunuz?");
        System.out.println("1- BOA\n2-WelsFargo\n3-ChaseBank");
        System.out.print("Seçiminiz=");
        Scanner oku=new Scanner(System.in);
        int bankaSecim= oku.nextInt();;

        Scanner okuBilgi=new Scanner(System.in);
        System.out.print("Adınız: ");
        String ad = okuBilgi.nextLine();

        System.out.print("Telefon No: ");
        String telNo = okuBilgi.nextLine();

        System.out.print("Adres: ");
        String adres = okuBilgi.nextLine();

        int employeeNo=1; //işlemi yapan çalışanın sicilNosu

        Bank hesabinBankasi=null;
        switch (bankaSecim){

            case 1:
                hesabinBankasi =new BOA(ad, telNo, adres, employeeNo);
                hesabinBankasi.openAccount();
                break;

            case 2:
                hesabinBankasi =new WellsFargo(ad, telNo, adres, employeeNo);
                hesabinBankasi.openAccount();
                break;

            case 3:
                hesabinBankasi =new ChaseBank(ad, telNo, adres, employeeNo);
                hesabinBankasi.openAccount();
                break;

        }

        System.out.println(hesabinBankasi);


        int secim=0;
        do{
            System.out.println("********** İşlem Menüsü**********");
            System.out.println("1-Para Yatır\n2-Para Çek\n3-Kredi Talep\n"+
                    "4-Bakiye Görüntüleme\n5-Hesap Kapat\n6-Çıkış");
            System.out.print("Seçiminiz: ");
            secim=oku.nextInt();

            double miktar=0;
            switch (secim){
                case 1:
                    System.out.print("Miktar= ");
                    miktar=oku.nextDouble();
                    hesabinBankasi.deposit(miktar);
                    break;

                case 2:
                    System.out.println("Miktar= ");
                    miktar=oku.nextDouble();
                    hesabinBankasi.withdraw(miktar);
                    break;

                case 3:
                    System.out.println(hesabinBankasi.loan());
                    break;

                case 4:
                    System.out.println("Bakiye= "+ hesabinBankasi.getBalance());
                    break;

                case 5:
                    hesabinBankasi.closeAccount();
                    break;
            }

        }while(secim !=6);
    }
}
