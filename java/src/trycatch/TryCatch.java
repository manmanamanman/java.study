package trycatch;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println();

        //Java的异常处理是通过如下5个关键字实现的
        // 1、try：执行可能产生异常的代码；
        // 2、catch：捕获异常；
        // 3、finally：无论是否发生异常，代码都会执行；
        // 4、throws：声明方法可能要抛出的各种异常；
        // 5、throw：手动抛出异常

        //格式：
//        try{
//            //代码段1
//            //产生异常的代码段2
//        }catch (异常类型 ex){
//            //对异常进行处理的代码段3
//        }finally {
//            //代码段4
//        }
        //try中执行程序有异常，才会执行catch中的代码，否则直接执行finally中的代码

        //试题1：使用异常捕捉，处理除0异常
        //查看包trycatch.t01

        //异常类型中exception类，常用的方法包含：printStackTrace()、getMessage()
        //printStackTrace():返回异常在堆栈中错误类型，错误是什么以及引起错误的地方
        //getMessage()：显示内容是printStackTrace()显示的一部分，只显示错误是什么

        //多路异常捕获：
        // 1、排列catch语句的顺序：先子类后父类，exception为父类，常用子类包含如下：
        //      （1）InputMismatchException 捕获输入类型异常，如要求输入整数，但是接收的是字符串或其他，都会匹配
        //      （2）ArithmeticException 捕获算术异常，如除0异常
        // 2、发生异常时按顺序逐个匹配；
        // 3、只执行第一个与异常类型匹配的catch语句
        //格式：
//        try{
//            //代码段1
//            //产生异常的代码段2
//        }catch (异常类型1 ex){
//            //对异常进行处理的代码段3
//        }catch (异常类型2 ex){
//            //对异常进行处理的代码段4
//        }catch (Exception ex){
//            //对异常进行处理的代码段5
//        }finally {
//            //代码段4
//        }

        //throws 声明异常
        //使用格式：
        //在一个方法的方法名后面，如 public void func() throws Exception {};
        //说明：
        // 1、当调用该方法时，该方法内部出现异常，调用方可以使用try-catch捕获异常，或不处理，继续声明异常；
        // 2、main()一般不需要设置异常声明，会被JVM吞掉
    }
}
