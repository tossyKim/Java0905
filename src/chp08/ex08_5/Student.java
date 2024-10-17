package chp08.ex08_5;

public class Student {

    static int count;

    int id;
    String name;

    Student(int id, String name) {
        count++;
        this.id = id;
        this.name = name;
    }
}
