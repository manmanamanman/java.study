package xunhuanjg;

import java.util.Scanner;

public class WhileXH {
    public static void main(String[] args) {
        //while循环  适用于不知道循环多少次
        //先判断，再执行
        //试题1：使用while循环输出1~10
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        //试题2：接收一个正整数，1+2+3+...+n大于该接收的数时，输出当第几位的大于该数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int sum= 0;
        if(input.hasNextInt()){
            int j = input.nextInt();
            if(j>0){
                int num = 0;
                while(sum<=j){
                    num++;
                    sum += num;
                }
                System.out.println("加至第"+num+"时大于"+j);
            }else{
                System.out.println("输入数据不合法!");
            }
        }else {
            System.out.println("输入数据不合法!");
        }


    }
}
