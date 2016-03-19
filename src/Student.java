import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by 鑫康 on 2016/3/14 0014.
 */
public class Student {
    private String name = "初始值";
    private int sex = 1;
    private int number = 0;
    Scanner in = new Scanner(System.in);
    public Student(){};
    public Student(String name,int sex,int number)
    {
        this.name = name;
        this.sex = sex;
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getSex() {
        return sex;
    }
}
