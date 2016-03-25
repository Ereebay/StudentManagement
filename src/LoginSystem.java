
import java.util.Scanner;

/**
 * Created by 鑫康 on 2016/3/17 0017.
 */
public class LoginSystem {
    public static void main(String[] args) {
        int model1;
        System.out.println("欢迎来到low的一逼的师生登录系统");
        System.out.println("*******************************");
        System.out.println("********请选择你的模式*********");
        System.out.println("********    1.学生    *********");
        System.out.println("********    2.教师    *********");
        System.out.println("*******************************");
        Scanner in = new Scanner(System.in);
        model1 = in.nextInt();
        Student stu = new Student();
        if(model1 == 1)
        {
            while(true)
            {
                System.out.println("请选择功能");
                System.out.println("1.登陆");
                System.out.println("2.注册");
                System.out.println("3.退出");
                int model2;
                model2 = in.nextInt();
                switch(model2)
                {
                    case 1:
                        switch (stu.login())
                        {
                            case 1:
                                Student student = new Student();
                                student = stu.getStudentinfo();
                                while (true)
                                {
                                    System.out.println("*****      菜单     *****");
                                    System.out.println("*****    1.查询     *****");
                                    System.out.println("*****    2.修改     *****");
                                    System.out.println("*****    3.退出     *****");
                                    System.out.println("*****    4.返回     *****");
                                    int key;
                                    key = in.nextInt();
                                    if(key == 4)
                                    {
                                        break;
                                    }
                                    switch (key)
                                    {
                                        case 1:

                                            System.out.println("您的学生信息如下：");
                                            System.out.println("姓名："+ student.getName());
                                            if(student.getSex() == 1)
                                            {
                                                System.out.println("性别：男" );
                                            }
                                            else
                                            {
                                                System.out.println("性别：女");
                                            }
                                            System.out.println("学号："+ student.getNumber());
                                            break;
                                        case 2:
                                            String name;
                                            int sex;
                                            int number;
                                            System.out.println("请输入姓名");
                                            name = in.next();
                                            student.setName(name);
                                            System.out.println("请输入性别,1男2女");
                                            sex = in.nextInt();
                                            student.setSex(sex);
                                            System.out.println("请输入学号");
                                            number = in.nextInt();
                                            student.setNumber(number);
                                            break;
                                        case 3:
                                            System.out.println("谢谢使用");
                                            System.exit(0);
                                        default:
                                            System.out.println("指令有误");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("是否需要注册账户");
                                int i;
                                i = in.nextInt();
                                if(i == 1)
                                {
                                    stu.register();
                                }
                                else
                                    System.out.println("返回上层");
                                break;
                            case 3:
                                System.out.println("返回上层");
                                break;
                        }
                        break;
                    case 2:
                        stu .register();
                        break;
                    case 3:
                        System.out.println("感谢使用");
                        System.exit(0);
                }
            }
        }
        else
        {
            System.out.println("教师暂时无法使用 科科");
        }

    }
}
