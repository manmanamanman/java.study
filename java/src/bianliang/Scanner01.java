package bianliang;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //接收外界输入内容
        Scanner input = new Scanner(System.in);  //除了input 自定义变量名可变，其他不可改变；
        System.out.println("请输入你喜欢的水果:");
        String a = input.next();                 //根据外界要接收的内容，设置对应类型的变量进行保存;
        System.out.println("你喜欢的水果:"+a);

        System.out.println("=====================");

        //试题1：求半径R=2.5的圆的周长与面积
        final double PI = 3.14;
        double R = 2.5;
        double zhouchang = 2 * PI * R;
        System.out.println("周长为"+zhouchang);
        double mianji = PI * R * R;
        System.out.println("面积为"+mianji);
        //将显示的值限制输出小数点后两位，使用String.format()函数，该函数输出的为字符串
        String result = String.format("%.2f",mianji);  //.2f为显示2为小数,会进行四舍五入
        System.out.println("目前面积为"+result);

        System.out.println("=====================");

        //试题2：有20位学生，他们总分合计为1205分，求平均成绩
        int total = 20;
        int tscore = 1205;
        double avg = tscore / (total * 1.0); //需注意，整数除于整数得到的也是整数，要想保证获取数据准确，需要一方变为浮点型
        System.out.println("平均成绩为"+avg);

        System.out.println("=====================");

        //试题3：输入整数123的每一位数字
        int num = 123;
        int gewei = num % 100 % 10;
        int shiwei = num % 100 / 10;
        int baiwei = num / 100;
        System.out.println("123的百位为"+baiwei+",十位为"+shiwei+",个位为"+gewei);

        System.out.println("=====================");

        //试题4：a1=1,b1=2将两个变量值进行互换
        int a1 = 1;
        int b1 = 2;
        int c1 = a1;
        a1 = b1;
        b1 = c1;
        System.out.println("a1="+a1+",b1="+b1);


    }
}
