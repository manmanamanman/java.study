package jihekuangjia.t02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T02 {
    static void bianli(List list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("===================");
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        Book b1=new Book("西游记",35.12,"吴承恩");
        Book b2=new Book("红楼梦",38.5,"曹雪芹");

        //添加内容
        list.add(b1);

        //遍历集合
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("===================");

        //首尾部插入内容
        Book b3=new Book("三国演义",38.5,"罗贯中");
        list.addFirst(b2);
        list.addLast(b3);
        bianli(list);

        //获取首部内容
        System.out.println(list.getFirst());
        System.out.println("===================");
        //获取首部内容
        System.out.println(list.getLast());
        System.out.println("===================");

        //删除首部内容
        System.out.println("删除"+list.removeFirst());
        System.out.println("===================");
        bianli(list);

        //删除尾部内容
        System.out.println("删除"+list.removeLast());
        System.out.println("===================");
        bianli(list);

    }
}
