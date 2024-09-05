package ex11;

public class CylinderMain {
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder();
        cyl.setHeight(5);
        cyl.setRadious(4);

        System.out.printf("원기둥의 부피 : %.2f\n", cyl.getVolume());
        System.out.printf("원기둥의 겉넓이 : %.2f\n",cyl.getSurfaceArea());
    }
}
