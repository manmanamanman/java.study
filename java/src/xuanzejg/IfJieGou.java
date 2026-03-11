package xuanzejg;

import java.util.Scanner;

public class IfJieGou {
    public static void main(String[] args) {
        //if结构包含：if、if-else、多重if、嵌套if
        //if
        //试题1：输入一个数，判断这个数是否为偶数。
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num+"是偶数！");
        }

        System.out.println("==================");

        //if-else
        //试题2：输入一个年份，判断该年份是闰年还是平年。闰年判断条件：能被4整除但不能被100整除；能被400整除；
        System.out.println("请输入一个年份：");
        int num1 = input.nextInt();
        if((num1%4==0 && num1%100!=0) || num1%400==0){
            System.out.println(num1+"是闰年！");
        }else {
            System.out.println(num1+"是平年！");
        }

        System.out.println("==================");

        //多重if 注意：多重if判断条件需要按自增或自减的顺序进行判断，不能乱序
        //试题3：输入一个分数，分数大于等于90输出优秀，分数大于等于80输出良好，分数大于等于60输出合格，否则输出不及格。
        System.out.println("请输入你的分数：");
        int num2 = input.nextInt();
        if(num2>=90){
            System.out.println("优秀！");
        } else if (num2>=80) {
            System.out.println("良好！");
        } else if (num2>=60) {
            System.out.println("合格！");
        }else {
            System.out.println("不及格！");
        }

        System.out.println("==================");

        //嵌套if
        //试题4：输入一个年份，判断该年份是闰年还是平年，当为平年时判断这个年份是偶数还是奇数，当为闰年时判断这个年份是偶数还是奇数。
        System.out.println("请输入一个年份：");
        int num3 = input.nextInt();
        if((num3%4==0 && num3%100!=0) || num3%400==0){
            if(num3%2==0){
                System.out.println(num3+"是闰年并且是偶数！");
            }else {
                System.out.println(num3+"是闰年但是奇数！");
            }
        }else {
            if(num3%2==0){
                System.out.println(num3+"是平年并且是偶数！");
            }else {
                System.out.println(num3+"是平年但是奇数！");
            }
        }


        //注意：在java中，字符串判断是否相同，使用equals()函数。如"你好".equals("你好")，相同。
        //逻辑运算符：&& 与、|| 或、！ 非
    }
}
