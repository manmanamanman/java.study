package java01.bianliang;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args){
        //转义符
        //'\n'，将光标移动到下一行的第一格
        //'\t'，空一个制表符
        System.out.print("Hello,Java!\n");
        System.out.println("xiaoming\txiaohong");

        System.out.println("==========================");

        //变量的命名规则：
        //1、变量名称不能与系统关键字重名；
        //2、变量名称只包含字母、数字和下划线，且首位不能是数字；
        //3、同一作用域，变量名称不能重复；
        //4、java区分大小写；
        //5、见名知意；
        System.out.println("变量的命名规则");

        System.out.println("==========================");

        //数据类型：
        //整数（int）、浮点型（double、float）、字符型（char）、字符串型（String）、布尔型（boolean）、常量（final）
        //常量的名称需要全部大写，如 final double PI=3.14;

        //Scanner应用
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = input.nextInt();
        System.out.println("输入的整数为："+num);

        System.out.println("==========================");

        //输出结果格式化
        //String result=String.format();
        double num1=3.0/4.1;
        System.out.println(num1);
        String result=String.format("%.2f",num1);

        System.out.println(result);

        System.out.println("==========================");

        int num2=30;
        for(int i=0;i<3;i++){
            num2 = num2/2-1;
        }
        System.out.println(num2);

        System.out.println("==========================");

        int num3=123;
        int ge,shi,bai;
        ge = num3 % 10;
        shi = num3 / 10 % 10;
        bai = num3 / 100;
        System.out.println(num3+"的个位："+ge+",十位为："+shi+",百位为："+bai);
    }
}
