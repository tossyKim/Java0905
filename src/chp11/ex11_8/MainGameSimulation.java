package chp11.ex11_8;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹");//휴먼
        Knight uther = new HolyKnight("우서");//신성한 능력
        Knight genji = new MagicKnight("겐지");// 마법 능력

        atomic.slash();
        uther.slash();
        genji.slash();

        Healer healer1 = (HolyKnight)uther;
        Healer healer2 = new HolyKnight("우서동생");

        //healer1.slash(); Healer 인터페이스의 참조변수임으로 Healer 인터페이스를 통해 구현된 메소드만 호출할 수 있다.
        healer1.heal();
        healer2.heal();

        Magician magician1 = (MagicKnight)genji;
        magician1.magicShield();
        magician1.teleport();

        MagicKnight magicnight = new MagicKnight("겐지동생");
        magicnight.magicShield();
        magicnight.teleport();
        magicnight.slash();
    }
}
