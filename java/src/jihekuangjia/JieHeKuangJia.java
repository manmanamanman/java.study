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

        //List是ArrayList与LinkedList的父接口

        //HashSet
        //Set接口存储一组唯一但无序的数据
        //Set中存放对象的引用地址

        //试题3：HashSet的使用
        //查看包jihekuangjia.t03

        //HashMap 双列集合 键值对的形式保存数据
        //常用的数据处理方法：
        //  1、put(key,value) 添加内容
        //  2、get(key) 通过key值去返回对应的value值
        //  3、keySet() 获取双列集合中的key值集合
        //  4、values() 获取双列集合中的value值集合
        //  5、containsKey(内容) 判断key中是否存在该值
        //  6、containsValue(内容) 判断value中是否存在该值

        //试题4：HashMap的使用
        //查看包jihekuangjia.t04

        //Iterator 迭代器
        //如何遍历Map集合？ --可以使用迭代器Iterator
        //如何使用Iterator?
        //  --第一步：获取迭代器对象，Collection接口中包含iterator方法，Collection子接口中包含list和set
        //  --第二部：通过创建的迭代器对象中的hasNext()方法来判断是否存在下一个可访问元素
        //  --第三步：再使用迭代器对象中的next()方法来获取下一个元素

        //试题4：Iterator的使用
        //查看包jihekuangjia.t04

        //泛型集合 即设置集合中要保存数据的数据类型，添加数据时只能存该类型数据，避免后续遍历时还要进行数量类型强制转换
        //包含List泛型和Map泛型，其接口下的子接口也可以定义泛型
        //格式：List<数据类型>、Map<数据类型1,数据类型2>

        //试题5：泛型集合的使用
        //查看包jihekuangjia.t05

        //试题6：使用泛型集合，编辑学生管理系统
        //查看包jihekuangjia.t06
    }
}
