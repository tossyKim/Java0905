package ex08_2;

public class MainDrink {
    public static void main(String[] args) {
        Drink d1 = new Drink();
        Drink d2 = new Drink("박카스",800);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }
}
