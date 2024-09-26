package chp08.chp08_num7;

public class Account {
    private int balance;
    private String num;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean transfer(Account account, int amount) {
        if(amount < this.balance) {
            this.balance -= amount;
            account.setBalance(account.getBalance() + amount);
            return true;
        }
        else
            return false;
        }
    public String toStr() {
        String str = "Account { num : "+ this.num +", balance : "+ this.balance + "}";
        return str;
    }
}

