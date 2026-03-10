package bianliang;

public class BianLiang {
    public static void main(String[] args){
        System.out.println("1、JDK与JRE的区别");
        //JDK：开发工具包。包含JRE;
        //JRE：运行环境;
        System.out.println("2、变量命名规范");
        //变量名不能和系统的关键字重名; 如 int int=1;
        //变量名只能包含字母（a~z、A~Z）、数字、下划线"_",并且开头只能是字母或下划线;
        //变量必须先定义后使用;
        //在同一作用域内,变量名不能重复;
        //java中变量名区分大小写,如num与Num是不同变量;
        //变量名要见名知意;
        System.out.println("3、数据类型");
        //整型:存储整数 int 如1、0、-1
        //浮点型:存储小数 float（单精度，即小数点后一位,如1.1） double（多精度，即小数点后多位，如1.22）;
        //字符型:存储单个字符 char 如'a'、'1'
        //字符串型:存储一串字符 String 如"Hello,Word!"、""、"a"
        System.out.println("4、常量");
        //在程序允许过程中，值不能改变的量;
        //定义常量，需要用到关键字final，格式如下:
        final double PI = 3.14;
        //注意：（1）常量名通常大写;（2）只能被赋值一次，且通常定义时对其初始化;
        System.out.println("5、运算符");
        //1.赋值运算符
        //变量名 = 表达式;
        //2.算术运算符
        //+(加法)、-(减法)、*(乘法)、/(取整)、%(取余)
        int num1 = 5;
        int num2 = 2;
        int num3 = num1 % num2; //取余,结果为1
        int num4 = num1 / num2; //取整,结果为2
        System.out.println("num3="+num3+"; num4="+num4);

        System.out.println("6、自增自减");
        //自增
        int a = 0;
        a++; //a = a + 1;
        System.out.println(a);
        //自减
        int b = 10;
        b--; //b = b - 1;
        System.out.println(b);
        //注意：
        //++或--在变量前后的区别
        //++(或--)在前：先让变量进行增减，再参与到其他运算或调用;
        //++(或--)在后：先参与其他运算或调用，再进行增减;
        //示例如下：
        int c = 0;
        System.out.println("先输出c为"+c++);
        System.out.println("后自增输出为"+c);



    }
}
