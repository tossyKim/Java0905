package chp09.ex9_3;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.printf("임의의 정수값 : %d\n", random.nextInt());
        System.out.printf("0~9 사이의 정수값 : %d\n", random.nextInt(10));
        System.out.printf("1~10 사이의 정수값 : %d\n", random.nextInt(10)+1);
        System.out.printf("임의의 실수값 : %f\n", random.nextFloat(100));
        System.out.printf("임의의 논리값 : %b", random.nextBoolean());
    }
}
