package chp08.chp08_num7;

public class AccountTest {
    public static void main(String[] args) {

        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);
        while(a.transfer(b,3000)){
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}
