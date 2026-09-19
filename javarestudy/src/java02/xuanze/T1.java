package java02.xuanze;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("选择结构");

        System.out.println("==========================");

        System.out.print("请输入你的分数：");
        int num = input.nextInt();
        if(num>=60){
            System.out.println("分数通过");
        }else {
            System.out.println("分数不通过");
        }

//        switch选择结构适用于条件判断等值判断的情况
//                示例：
//        switch (表达式){ --表达式只能是int、char和String类型
//            case 常量1:
//                语句;
//                break;
//            case 常量2:
//                语句;
//                break;
//            case 常量3:
//                语句;
//                break;
//            default:
//                语句;
//                break;
//        }

    }
}
