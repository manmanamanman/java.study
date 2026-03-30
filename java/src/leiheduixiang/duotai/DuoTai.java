package leiheduixiang.duotai;

public class DuoTai {
    public static void main(String[] args) {
        System.out.println();

        //多态
        //定义：同一种方法，由于条件不同，产生的结果也不同；
        //多态的代码理解：同一个引用类型，使用不同的实例而执行不同操作，也可以说，使用父类变量指向子类对象；

        //父类与子类互转方式：
        //1、父类转成子类
        //示例1：Pet pet=new Dog();
        //示例2：Dog dog=(Dog)pet;
        //2、子类转父类【自动转换】

        //instanceof
        //作用：判断该对象是否属instanceof后面的类中，从而协助完成调用子类中特有的方法。配合多态使用
        //格式：对象 instanceof 类

        //Random 随机数
        //若需要使用随机数方法，需要先创建对象
        //使用步骤：
        // 1、创建对象   Random random=new Random();
        // 2、调用需要使用类型的方法,如整数  random.nextInt(10)  --nextInt中的10代表0~9之间随机取值

    }
}
