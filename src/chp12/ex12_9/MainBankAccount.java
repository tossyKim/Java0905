package chp12.ex12_9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(
                "손예진", "111-22-3333",1000000);
        BankAccount ba2 = new BankAccount(
                "현빈", "555-66-8888",10000000);

        try {
            File file = new File("result_accounts.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(ba1.toString()+"\n");
            fw.write(ba2.toString()+"\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
