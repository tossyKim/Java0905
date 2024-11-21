package chp11.ex11_4;

import java.util.ArrayList;

public class MainFlyable {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter hc = new Helicopter();
        Rocket rc = new Rocket();

//        배열에 각 객체의 참조값을 저장한다.
        FlyAble[] flyAbles = {bird, hc, rc};

        for (FlyAble flyAble : flyAbles) {
            flyAble.fly();
        }

        System.out.println("=======================================");

        ArrayList<FlyAble> flyAbleList = new ArrayList<FlyAble>();
        flyAbleList.add(hc);
        flyAbleList.add(rc);
        flyAbleList.add(bird);

        for (FlyAble flyAble : flyAbleList) {
            flyAble.fly();
        }
    }
}
