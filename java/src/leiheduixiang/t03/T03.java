package leiheduixiang.t03;

import java.util.Scanner;

public class T03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个正整数：");
            calculator.score[i] = input.nextInt();
        }
        String avgscore = calculator.avg();
        int maxscore = calculator.max();
        int minscore = calculator.min();

        System.out.println("平均数为：" + avgscore + ",最大值为：" + maxscore + ",最小值为：" + minscore);
    }
}
