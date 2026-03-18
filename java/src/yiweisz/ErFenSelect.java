package yiweisz;

import java.util.Scanner;

public class ErFenSelect {
    public static void main(String[] args) {
        //二分查找
        //要求数组元素需要递增或递减排序
        //流程：
        //1、设置左右边界；
        //2、取中间值与要查找的数进行比较，当中间值大于查找值则更新右边界，当中间值小于查找值则更新左边界；

        //试题1：输入一个1~100之间的整数，根据二分查找，输出查找的数和查找到后当前的查找次数。
        Scanner input=new Scanner(System.in);
        System.out.println("请在1~100之间选择一个整数：");
        int num=input.nextInt();

        //设置左右边界值
        int left=1,right=100;
        int count=0; //查询次数
        while (left<=right){
            count++;
            //取中间值
            int temp=(left+right)/2;
            if(temp==num){
                System.out.println("已查到，当前查询次数为"+count+"次");
                break;
            }
            if(temp>num){
                right=temp-1;  //查到的数就不要再纳入到查找范围里了
            }
            if(temp<num){
                left=temp+1; //同理
            }
        }
    }
}
