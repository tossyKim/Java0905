package chp08.chp08_num8;

public class Monster {
    private String name;
    private int hp;
    private static int maxHP = 30;

    public Monster(String name) {
        this.name = name;
        this.hp = maxHP;
    }
    public void Attack(Monster enemy){
        enemy.hp -= 10;
    }
    public static void battle(Monster a, Monster b){
        while(a.hp >0 && b.hp >0){
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;

            attacker.Attack(defender);


            System.out.printf("[%s]의 공격 -> %s의 체력 : %d/%d\n",
                    attacker.name,defender.name,defender.hp,defender.maxHP);
        }
    }
}



