package jihekuangjia.t03;

import java.util.HashSet;

public class T03 {
    public static void main(String[] args) {
        HashSet set=new HashSet();

        Book b1=new Book("西游记",35.12,"吴承恩");

        Book b2=b1;
        set.add(b1);
        set.add(b2);
        System.out.println(set.size()); //输出的值为1，因为引用类型赋值，赋的是地址，Set中统计长度，统计的是数据的总数而不知指针的总数
    }
}
