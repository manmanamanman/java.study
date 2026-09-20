package java05.shuzu;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        System.out.println("一维数组");

        System.out.println("========================");

        //
        int[] num=new int[5];
        int[] score={1,4,5,2,6,8,0};
        for(int i=0;i<num.length;i++){
            num[i]=i+1;
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        //Arrays.sort()数组升序排序
        Arrays.sort(score);
        for(int i=0;i<score.length;i++){
            System.out.print(score[i]+"\t");
        }
        System.out.println();
        //冒泡排序，降序排序
        for(int i=0;i<score.length-1;i++){
            for(int j=0;j<score.length-1-i;j++){
                if(score[j]<score[j+1]) {
                    int temp = score[j];
                    score[j]=score[j+1];
                    score[j+1]=temp;
                }
            }
        }
        for(int i=0;i<score.length;i++){
            System.out.print(score[i]+"\t");
        }
    }
}
