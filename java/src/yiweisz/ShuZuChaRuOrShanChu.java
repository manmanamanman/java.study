package yiweisz;

import java.util.Arrays;

public class ShuZuChaRuOrShanChu {
    //数组的插入与删除
    //数组插入元素流程：
//    1、先找出要插入到数组中的下标；
//    2、从后往前进行原数组元素挪位；
//    3、将挪出来的要插入元素的位置进行赋值；
    //试题1：在一组升序数组score{56，78,89,90}中插入58，并依旧按升序输出
    public static void main(String[] args) {
        int[] score=new int[5];
        score[0]=56;
        score[1]=78;
        score[2]=89;
        score[3]=90;

        //设置初始下标
        int index=score.length-1;
        //找位置
        for(int i=0;i<score.length-2;i++){
            if(score[i]>58){
                index=i;
                break;
            }
        }
        //挪位置
        for(int i=score.length-1;i>index;i--){
            score[i]=score[i-1];
        }
        //赋值
        score[index]=58;

        for(int i=0;i<score.length;i++){
            System.out.print(score[i]+"\t");
        }

        System.out.println();
        //数组元素删除
        //流程如下：
        //先定位要删除元素的下标index
        //将index后的元素向前进一位

        //试题2：将试题1中新增的元素删除
        int indexd=score.length-1;
        for(int i=0;i<score.length;i++){
            if(score[i]==58){
                indexd=i;
                break;
            }
        }
        for(int i=indexd;i< score.length-2;i++){
            score[i]=score[i+1];
        }
        for(int i=0;i< score.length-1;i++){
            System.out.print(score[i]+"\t");
        }
    }
}
