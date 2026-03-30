package jiekou.t02;

import java.util.Scanner;

public class T02 {
    public static void menu(){
        System.out.println("请输入您需要的业务:");
        System.out.println("0、退出");
        System.out.println("1、加");
        System.out.println("2、减");
        System.out.println("3、乘");
        System.out.println("4、除");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Add add=new Add();
        Sub sub=new Sub();
        Mul mul=new Mul();
        Div div=new Div();
        boolean flag=true;
        while (flag==true){
            menu();
            int num=input.nextInt();
            int num1,num2;
            double result;
            switch (num){
                case 1:
                    System.out.println("请输入第1个数:");
                    num1=input.nextInt();
                    System.out.println("请输入第2个数:");
                    num2=input.nextInt();
                    result=add.calc(num1,num2);
                    System.out.println("结果为:"+result);
                    break;
                case 2:
                    System.out.println("请输入第1个数:");
                    num1=input.nextInt();
                    System.out.println("请输入第2个数:");
                    num2=input.nextInt();
                    result=sub.calc(num1,num2);
                    System.out.println("结果为:"+result);
                    break;
                case 3:
                    System.out.println("请输入第1个数:");
                    num1=input.nextInt();
                    System.out.println("请输入第2个数:");
                    num2=input.nextInt();
                    result=mul.calc(num1,num2);
                    System.out.println("结果为:"+result);
                    break;
                case 4:
                    System.out.println("请输入第1个数:");
                    num1=input.nextInt();
                    System.out.println("请输入第2个数:");
                    num2=input.nextInt();
                    result=div.calc(num1,num2);
                    System.out.println("结果为:"+result);
                    break;
                default:
                    flag=false;
                    System.out.println("感谢您的使用!");
                    break;
            }
        }

    }
}
