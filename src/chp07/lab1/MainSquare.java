package chp07.lab1;

public class MainSquare {
    public static void main(String[] args) {
        Square sq = new Square();

        sq.setLength(2.5);
        System.out.printf("길이 : %.2f㎠\n", sq.getLength());
        System.out.printf("넓이 : %.2f㎠\n",sq.area());

        System.out.printf("길이 %.2f㎝ 인 정사각형의 면적은 %.2f㎠ 입니다.\n",sq.getLength(),sq.area());

        Square sq2 = new Square();

        sq2.setLength(6.7);
        System.out.printf("길이 : %.2f㎠\n", sq2.getLength());
        System.out.printf("넓이 : %.2f㎠\n",sq2.area());

        System.out.printf("길이 %.2f㎝ 인 정사각형의 면적은 %.2f㎠ 입니다.\n",sq2.getLength(),sq2.area());
    }
}
