package chp11.ex11_4;

public class Rocket implements FlyAble
{
    @Override
    public void fly() {
        System.out.println("로켓이 대기권 밖으로 수직상승합니다.");
    }
}
