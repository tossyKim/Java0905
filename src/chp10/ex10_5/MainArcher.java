package chp10.ex10_5;

public class MainArcher {
    public static void main(String[] args) {
        Archer archer1 = new Archer();
        MasterAcher ma = new MasterAcher();
        Archer archer2 = new MasterAcher();
        Archer archer3 = (Archer) new MasterAcher();

        archer1.shoot();
        ma.shoot();
        archer2.shoot();
        archer3.shoot();
    }
}
