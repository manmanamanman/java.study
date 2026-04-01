package jiekou.t04;

import java.util.Scanner;

public class T04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("二维图形面积计算:1、矩形;2、正方形");
        int num = input.nextInt();

        SumArea sumArea;  //定义一个接口类型变量存储实现类的实例化对象

        switch (num) {
            case 1:
                System.out.println("请输入矩形的长:");
                int h = input.nextInt();
                System.out.println("请输入矩形的宽:");
                int w = input.nextInt();
                sumArea = new JuXing(h, w);  //用接口变量，存储JuXing的实例化对象，并调用该实现类的带参构造函数，进行赋值
                sumArea.sumArea(); //调用JuXing中的sumArea方法输出面积
                break;
            case 2:
                System.out.println("请输入正方形的边长:");
                int weight = input.nextInt();
                sumArea = new ZhengFangXing(weight);  //用接口变量，存储ZhengFangXing的实例化对象，并调用该实现类的带参构造函数，进行赋值
                sumArea.sumArea(); //调用ZhengFangXing中的sumArea方法输出面积
                break;
            default:
                System.out.println("该图形不在选项中");
                break;
        }
    }
}
