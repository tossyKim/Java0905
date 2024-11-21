package chp11.ex11_1;

public interface Phone {
//    인터페이스는 상수, 추상메소드, default메소드 등을 사용할 수 있습니다.
//    상수는 final, static을 생략 가능
    String PRODUCT_NAME = "Apple";

//    추상 메소드는 public abstract를 생략 가능
    public abstract void CallPhone(String phoneNumber);
    void receivePhone(String phoneNumber);
}
