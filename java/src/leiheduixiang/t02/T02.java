package leiheduixiang.t02;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //使用数组，自定义一个用户表，表中保存用户信息
        //定义一个UserInfo数组，数组中每个元素是一个对象
        UserInfo[] users = new UserInfo[10];

        //创建对象
        UserInfo user = new UserInfo();
        user.username = "小明很狗带";
        user.password = "666666";

        //将创建的对象保存到UserInfo数组中
        users[0] = user;

        //新增登录状态标志
        boolean flag = false;

        //接收登录的用户名和密码
        System.out.println("请输入用户名：");
        String uname = input.next();
        System.out.println("请输入密码：");
        String upsd = input.next();

        //将接收的信息与UserInfo中的元素进行比对
        for (int i = 0; i < users.length - 1; i++) {
            if (users[i] != null && users[i].username.equals(uname) && users[i].password.equals(upsd)) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}
