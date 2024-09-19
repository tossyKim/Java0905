package chp08.ex08_1;

public class hero {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private int power;
    private int speed;
    private String name;

    public hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public hero(String name) {
        this.name = name;
    }

    public hero() {
    }

    public hero(String name, int power, int speed) {
        this.power = power;
        this.speed = speed;
        this.name = name;
    }

//    public String toString(){
//        return String.format("Hero{name : %s, power : %d, speed : %d}", name, power, speed);
//    }


    @Override
    public String toString() {
        return "hero{" +
                "power=" + power +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
