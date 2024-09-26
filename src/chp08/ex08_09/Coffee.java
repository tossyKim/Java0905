package chp08.ex08_09;

public class Coffee {
    private int price;
    private String name;

    public Coffee(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}


