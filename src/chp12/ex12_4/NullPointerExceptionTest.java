package chp12.ex12_4;
import java.util.ArrayList;

// 참조변수를 선언하고 객체 참조값을 대입하지 않은 상태로 사용하면 NullpointerException이 발생한다
public class NullPointerExceptionTest {
    ArrayList<String> listNames = new ArrayList<>();


    public void addName(String name){
        listNames.add(name);
    }
    public void printAllNames(){
        for(String name : listNames){
            System.out.println(name);
        }
    }

}
