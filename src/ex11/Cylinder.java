package ex11;

public class Cylinder {
    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    private double radious;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        double result = radious * radious * Math.PI * height;
        return result;
    }

    public double getSurfaceArea(){
        double circleArea = radious * radious * Math.PI;
        double rectangleArea = height * 2 * Math.PI * radious;

        return 2 * circleArea + rectangleArea;
    }
}
