/**
 * Created by 鑫康 on 2016/3/14 0014.
 */
public class Teacher extends User {
    private String name = "初始值";
    private int sex = 1;
    private int num = 1;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public int getSex() {
        return sex;
    }
}
