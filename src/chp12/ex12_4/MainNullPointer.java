package chp12.ex12_4;

public class MainNullPointer {
    public static void main(String[] args) {
        NullPointerExceptionTest nullTest = new NullPointerExceptionTest();

        nullTest.addName("이름1");
        nullTest.addName("이름2");
        nullTest.printAllNames();
    }
}
