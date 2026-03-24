package leiheduixiang.t05;

public class StaticList {
    public static int num;
    static {
        num+=100;
        System.out.println(num);
    }
    static {
        num+=500;
        System.out.println(num);
    }
}
