package chp12.ex12_7;

import chp12.ex12_6.MyAgetException;

public class MainThrows {
    public static void main(String[] args){
        ThrowsTest tt = new ThrowsTest();
        try {
            tt.test1();
        }catch (MyAgetException e){
            System.out.println(e);
        }
    }
}
