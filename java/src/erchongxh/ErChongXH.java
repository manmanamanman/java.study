package erchongxh;

import java.util.Scanner;

public class ErChongXH {
    public static void main(String[] args) {
        //二重循环
        //试题1：使用二重循环打印输出如下图形：
        //*****
        //*****
        //*****
        //注意：外层循环控制打印图形的行数；内层循环打印图形的列数；
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");

        //试题2：输出如下图形
        //        *
        //        **
        //        ***
        //        ****
        //        *****
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");

        //试题3：接收一个整数，打印该整数的等腰三角形，示例如下图形
        //    *
        //   ***
        //  *****
        // *******
        //*********
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = input.nextInt();
        for(int i=1;i<=num;i++){
            for(int k=1;k<=num-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");

        //试题4：打印如下图形
        //        0
        //        12
        //        345
        //        6789
        int sum = 0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum);
                sum++;
            }
            System.out.println();
        }

        System.out.println("==================");

        //试题5：打印九九乘法表
        int sum1;
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                sum1=i*j;
                System.out.print(i+"*"+j+"="+sum1+"\t");
            }
            System.out.println();
        }
    }
}
