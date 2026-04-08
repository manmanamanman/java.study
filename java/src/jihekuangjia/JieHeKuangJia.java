package jihekuangjia;

public class JieHeKuangJia {
    public static void main(String[] args) {
        System.out.println();

        //集合框架
        //Collection 接口存储一组不唯一、无序的对象
        //  1、List 接口存储一组不唯一、有序的对象
        //  2、Set 接口存储一组唯一、无序的对象
        //Map 接口存储一组键值对象，提供key到value的映射

        //ArrayList
        //长度可变的数组，在内存中分配连续的空间。遍历元素和随机访问元素的效率比较高；
        //ArrayList操作数据的常用方法：
        //  1、添加数据：add(Object obj)
        //  2、插入数据：add(int index,Object obj)
        //  3、删除数据：remove(Object obj)
        //  4、删除指定位置的元素：remove(int index)
        //  5、判定是否存在指定元素：contains(Object obj) 返回boolean类型

        //试题1：使用ArrayList实现一个图书管理系统
        //查看包jihekuangjia.t01

        //LinkedList
        //链表，每一个由实际内存与下一个元素指针组成。插入、删除效率高；
        //LinkedList提供对头部和尾部元素进行添加和删除操作的方法：
        //  1、addFirst(Object obj) 在首部添加元素
        //  2、addLast(Object obj) 在尾部添加元素
        //  3、getFirst() 获取首部元素
        //  4、getLast() 获取尾部元素
        //  5、removeFirst() 删除并返回列表中的第一个元素
        //  6、removeLast() 删除并返回列表中的最后一个元素

        //试题2：使用LinkedList实现一个图书管理系统
        //查看包jihekuangjia.t02

    }
}
