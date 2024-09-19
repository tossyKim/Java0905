package chp08.ex08_1;

public class MainHero {

    public static void main(String[] args) {
        hero ironMan = new hero("아이언맨", 100, 130);
        hero hulk = new hero("헐크", 200, 100);

        System.out.println(ironMan.toString());
    }
}
