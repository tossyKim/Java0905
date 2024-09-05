package ex10;

public class BicycleMain {

    public static void main(String[] args) {

        Bicycle bi1 = new Bicycle();

        bi1.setPrice(5000);
        bi1.setName("자전거");
        bi1.setWeight(10.5);

        System.out.printf("b1 => name : %s, wieght : %.2f, price : %d\n", bi1.getName(), bi1.getWeight(),bi1.getPrice());
    }
}
