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
    public void getinfo()
    {
        System.out.println("您的学生信息如下：");
        System.out.println("姓名："+ name);
        if(sex == 1)
        {
            System.out.println("性别：男" );
        }
        else
        {
            System.out.println("性别：女");
        }
        System.out.println("学号："+ number);
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
}
