package jihekuangjia.t01;

import java.util.ArrayList;
import java.util.Objects;

public class T01 {
    static void bianli(ArrayList list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("===================");
    }
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        Book b1=new Book("西游记",35.12,"吴承恩");
        Book b2=new Book("红楼梦",38.5,"曹雪芹");

        //添加内容
        list.add(b1);
        list.add(b2);

        //遍历集合
        //ArrayList进行遍历时可以使用for循环或者for增强进行遍历。
        //使用for增强时，循环参数类型需要改为Object
        //for(Object p:list){
        //     System.out.println(p.toString());
        // }
        //for循环时，通过list.size()获取实际集合长度，数组是通过length()来获取数组长度。使用list.get(i)来获取集合中的元素内容
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("===================");

        //插入内容
        Book b3=new Book("三国演义",38.5,"罗贯中");
        list.add(1,b3);
        bianli(list);

        //删除内容
        list.remove(b1);
        bianli(list);

        //通过指定指针进行删除
        list.remove(0);
        bianli(list);

        //判断集合中是否存在某个内容
        if(list.contains(b2)){
            System.out.println("存在"+b2);
        }
    }
}
