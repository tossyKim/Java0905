package chp10.ex10_1;

public class Knight extends Novice{
    int Stamina;

    void slash(){
        System.out.printf("%s(HP : %d, Stamina : %d)의 칼로베기 ~~//////~~\n",name,hp,Stamina);
    }
}
