package yiweisz;

import java.util.Scanner;

public class SelectMaxOrMin {
    public static void main(String[] args) {
        //输出数组中最大值与最小值
        //试题1:输入某次期中考试5位学员的成绩，求出最高分与最低分
        Scanner input =new Scanner(System.in);
        int[] score = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"位学生成绩：");
            score[i]=input.nextInt();
        }
        //设置初始最大值、最小值
        int max=score[0];
        int min=score[0];
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            }
            if(score[i]<min){
                min=score[i];
            }
        }
        System.out.println("最高分为："+max);
        System.out.println("最低分为："+min);
    }
}
