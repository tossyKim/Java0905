package chp11.ex_11_1;

public class MainIphine {
    public static void main(String[] args) {

//  업캐스팅 된 경우 참조 변수는 부모의 것을 사용할 수 있고,
//  자식의 것은 오버라이딩 된 것만 사용할 수 있다
        Phone p = new IPhone();
        p.CallPhone("010-3333-7777");
        p.receivePhone("02-111-5555");
        System.out.println("제조사명 : "+Phone.PRODUCT_NAME);

        IPhone iPhone = new IPhone();
        iPhone.beep();
        iPhone.CallPhone("02-777-1111");
        iPhone.playMusic("APT");
        iPhone.sendAriDrop("사진");
        iPhone.sendMessage("오늘 수능 대박나라");

        Alarm alarm = iPhone;
        alarm.beep();
        alarm.playMusic("Sticky");


    }
}
