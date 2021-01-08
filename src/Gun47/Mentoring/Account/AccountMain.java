package Gun47.Mentoring.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account accoun1=new Account(11111,"ALi","aaaa@gmail.com",1000);
//        Account account2=new Account();
//        account2.setAcc_no(1000);
        System.out.println(accoun1.getAcc_no()+" "+accoun1.getName()+" "+accoun1.getEmail()+" "+accoun1.getAmount());
    }
}
