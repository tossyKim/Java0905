package chp08.ex08_8;

public class Account {

    private int balance;
    private String name;
    private String pwd;
    private String accNumber;

    public Account(String accNumber, String name, String pwd, int balance) {
        this.balance = balance;
        this.accNumber = accNumber;
        this.name = name;
        this.pwd = pwd;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", accNumber='" + accNumber + '\'' +
                '}';
    }

    //입금 : deposit
    //출금 : withdraw

    public void deposit(int money) {
        balance += money;
//        System.out.printf("잔액 : %d\n",this.balance);
    }
    public void withdraw(int money) {
        balance -= money;
//        System.out.printf("잔액 : %d\n",this.balance);
    }
}
