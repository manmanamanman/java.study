package bianliang;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class ZiMuZhuanHuan {
    public static void main(String[] args) {
        //字母大小写转换
        //接收一个字母，输出对应大小写的字母
        Scanner input = new Scanner(System.in);
        System.out.println("请任意输入一个字母:");
        //需注意Scanner接收中没有单独接收char类型的函数，需要使用next()接收字符串，然后使用charAt(0)，取字符串的第一位
        char zimu = input.next().charAt(0);
        //a的ASCII的值为97，A的ASCII的值为65，各对应字母之前相差32
        int result = zimu;
        if(result >= 97){
            zimu = (char)(result - 32);
        }else {
            zimu = (char)(result + 32);
        }
        System.out.println("对应转换字母为"+zimu);

    }
}
