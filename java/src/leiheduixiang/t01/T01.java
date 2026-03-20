package leiheduixiang.t01;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Cat cat1=new Cat();
        System.out.println("请输入猫猫名称：");
        cat1.name=input.next();
        System.out.println("请输入猫猫颜色：");
        cat1.color=input.next();
        cat1.say();

        Cat cat2=new Cat();
        System.out.println("请输入猫猫名称：");
        cat2.name=input.next();
        System.out.println("请输入猫猫颜色：");
        cat2.color=input.next();
        cat2.say();
    }
}
