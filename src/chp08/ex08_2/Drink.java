package chp08.ex08_2;

public class Drink {
    private String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Drink() {
        name = "이름없음";
        price = 0;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
