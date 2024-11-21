package chp11.ex11_7;

import java.util.ArrayList;

public interface DayInterface {
//인터페이스 내에서는 상수만 사용되기 때문에 public static final을 생략할 수 있다.
//final은 처음 초기화를 한 후에는 다름 값으로 변경할 수 없다.
//static은 인터페이스명을 .앞에 붙여서 상수를 사용할 수 있다.
    String MONDAY = "월요일";
    public static final String TUESDAY = "화요일";

}
