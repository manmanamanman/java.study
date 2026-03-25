package leiheduixiang.chouxiangandfengzhuang;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        //封装后私有变量的赋值与取值
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您的名称：");
        String name=input.next();
        System.out.println("请输入您的年龄：");
        int age=input.nextInt();

        FengZhuanFunc fengzhuang=new FengZhuanFunc();
        fengzhuang.setName(name);
        fengzhuang.setAge(age);

        System.out.println("您的名称为："+fengzhuang.getName()+",您的年龄为："+fengzhuang.getAge());
    }
}
