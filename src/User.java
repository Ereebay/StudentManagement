
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by 鑫康 on 2016/3/17 0017.
 */
public class User {
    private String user = "admin";
    private String password = "admin";
    Scanner in = new Scanner(System.in);
    public User(){};
    public User(String usr,String pwd)
    {
        this.user = usr;
        this.password = pwd;
    }
    ArrayList<User> list = new ArrayList<User>();
    public String getUser()
    {
        return user;
    }
    public String getPassword()
    {
        return  password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int login()
    {
        int j = 0;
        System.out.println("请输入你的用户名和密码");
        String user = in.next();
        String password = in.next();
        for (int i = 0;i<list.size();i++)
        {
            if (Objects.equals(user, list.get(i).getUser()) & Objects.equals(password, list.get(i).getPassword()))
            {
                System.out.println("登陆成功");
                j =1;
            }
            else if (!Objects.equals(user, list.get(i).getUser())) {
                System.out.println("登录失败");
                System.out.println("账户不存在");
                j = 2;
            } else if (Objects.equals(user,list.get(i).getUser()) & !Objects.equals(password,list.get(i).getPassword()))
            {
                System.out.println("登录失败");
                System.out.println("密码不匹配");
                j = 3;
            } else {
                j = 0;
            }
        }
        return j;
    }

    public int register()
    {
        System.out.println("欢迎来到注册页面");
        System.out.println("请输入你想要的的用户名");
        String usr;
        usr = in.next();
        System.out.println("请输入你想要的的密码");
        String pwd;
        pwd = in.next();
        list.add(new User(usr,pwd));
        System.out.println("注册成功，请牢记你的用户名："+list.get(list.size()-1).getUser()+"密码："+list .get(list.size()-1).getPassword());
        return 1;
    }
}
