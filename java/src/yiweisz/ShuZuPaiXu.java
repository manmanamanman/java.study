package yiweisz;

import java.util.Arrays;
import java.util.Scanner;

public class ShuZuPaiXu {
    public static void main(String[] args) {
        //数组排序
        //升序排序
        //使用java中提供的Arrays.sort()函数进行升序排序
        //试题1：输入5个数，按升序排序输出
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            num[i] = input.nextInt();
        }
        //Arrays.sort()函数调用
        Arrays.sort(num);
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i] + "\t");
        }
        System.out.println();
        //手动降序排序
        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length-i-1];
            num[num.length-i-1] = temp;
        }
        for (int i=0;i<num.length;i++) {
            System.out.print(num[i]+"\t");

        }
    }
}