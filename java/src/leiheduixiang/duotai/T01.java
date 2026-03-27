package leiheduixiang.duotai;

public class T01 {
    public static void main(String[] args) {
        //创建子类对象，调用自定义带参构造方法初始化赋值
        Dog dog=new Dog("小黑",60);
        Cat cat=new Cat("小白",80);

        Master master=new Master();
        //喂狗
        master.feed(dog,30);
        //喂猫
        master.feed(cat,20);

        master.work(dog);
        master.work(cat);
    }
}
