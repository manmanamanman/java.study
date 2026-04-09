package jihekuangjia.t05;

import java.util.*;

public class T05 {
    public static void main(String[] args) {
        //定义List泛型集合
        List<Book> list=new ArrayList<Book>();

        Book b1=new Book("西游记",35.12,"吴承恩");
        Book b2=new Book("红楼梦",38.5,"曹雪芹");

        //添加数据
        list.add(b1);
        //插入数据
        list.add(0,b2);
        //数据遍历，使用for增强
        for(Book p:list){
            System.out.println(p.toString());
        }

//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        //定义Map泛型集合
        Map<String,Book> map= new HashMap<String,Book>();
        map.put(b1.getName(),b1);
        map.put(b2.getName(),b2);

        //Map泛型的遍历
        //方式一：通过获取KeySet()集合，使用for循环来遍历
        Set<String> keys = map.keySet();
        for(String p:keys){
            Book book = map.get(p);
            System.out.println(p+":"+book.getAuthor());
        }

        //方式二：直接获取values()集合，使用for循环来遍历
        Collection<Book> values = map.values();
        for(Book p:values){
            System.out.println(p.getName()+":"+p.getAuthor());
        }

        //方式三：通过entrySet()将每一个键值对作为一个元素组成Set散列表，再使用for循环，获取每一个键值对，再通过Set集合中的getKey()和getValue()来获取键与值
        Set<Map.Entry<String, Book>> entries = map.entrySet();
        for(Map.Entry<String, Book> p:entries){
            System.out.println(p.getKey()+":"+p.getValue().getAuthor());
        }
        System.out.println(map);
    }
}
