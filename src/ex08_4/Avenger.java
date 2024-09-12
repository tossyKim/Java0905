package ex08_4;

public class Avenger {
    private String name;
    private int health;


    public Avenger(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void punch(Avenger enemy){
        System.out.printf("<%s>의 펀치가 날아갔다. -> ", name);
        enemy.setHealth(enemy.getHealth()-10);
        System.out.printf("<%s>의 남은 체력 : %d\n",enemy.getName(),enemy.getHealth());
    }
}
