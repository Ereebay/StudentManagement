
import java.util.Scanner;

/**
 * Created by 鑫康 on 2016/3/17 0017.
 */

public class LoginSystem {
    public static void main(String[] args) {
        while (true) {
            int model1;
            System.out.println("欢迎来到low的一逼的师生登录系统");
            System.out.println("*******************************");
            System.out.println("********请选择你的模式*********");
            System.out.println("********    1.学生    *********");
            System.out.println("********    2.教师    *********");
            System.out.println("********    3.退出    *********");
            System.out.println("*******************************");
            Scanner in = new Scanner(System.in);
            model1 = in.nextInt();
            Login login = new Login();
            login.menu(model1);
        }
    }
}
