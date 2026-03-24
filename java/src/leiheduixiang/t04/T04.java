package leiheduixiang.t04;

import java.util.Scanner;

public class T04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int n = input.nextInt();
        JieCheng jiecheng = new JieCheng();
        int result = jiecheng.jieCheng(n);
        System.out.println(n + "!=" + result);
    }
}
