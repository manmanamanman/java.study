package log4j.t01;


import org.apache.log4j.Logger;

public class UseLog4J {
    public static void main(String[] args) {
        //调用log4j的getLogger(当前类的字节码文件名)方法，与普通类创建对象类似
        Logger logger= Logger.getLogger(UseLog4J.class);
        //根据调用logger中的方法级别，结合log4j配置文件中对输出到文件的级别来判断是否打印。日志级别参考Log4J.java文件中的解释
        logger.error("这是一个错误信息");
    }
}
