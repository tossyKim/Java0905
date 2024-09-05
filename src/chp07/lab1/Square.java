package chp07.lab1;

public class Square {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double area(){
        double result = Math.pow(length,2);
        return result;
    }
}
