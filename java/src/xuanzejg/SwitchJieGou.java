package xuanzejg;

import java.util.Scanner;

public class SwitchJieGou {
    public static void main(String[] args) {
        //switch选择结构适用于等值判断
        //试题1：根据输入的数字，代表周几，打印当天的菜单
        //        周一：红烧肉；
        //        周二：土豆牛肉；
        //        周三：炸鸡；
        //        周四：汉堡；
        //        周五：白菜豆腐；
        Scanner input = new Scanner(System.in);
        for(int i=3;i>0;i--) {
            System.out.println("请在1~5中选择一个数字：");
            if (input.hasNextInt()) {
                int num = input.nextInt();
                if(num>=1&&num<=5) {
                    switch (num) {
                        case 1:
                            System.out.println("红烧肉!");
                            break;
                        case 2:
                            System.out.println("土豆牛肉!");
                            break;
                        case 3:
                            System.out.println("炸鸡!");
                            break;
                        case 4:
                            System.out.println("汉堡!");
                            break;
                        default:
                            System.out.println("白菜豆腐!");
                            break;
                    }
                    break;
                }else {
                    if(i==1) {
                        System.out.println("次数已耗尽!");
                    }else{
                        System.out.println("输入数字不在1~5之间，请重新输入!");
                    }
                }
            } else {
                if(i==1) {
                    System.out.println("次数已耗尽!");
                }else{
                    System.out.println("输入数字不在1~5之间，请重新输入!");
                }
            }
        }
    }
}
