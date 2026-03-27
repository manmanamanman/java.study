package leiheduixiang.duotai;

public class Dog extends Pet{

    public Dog(){

    }
    //自定义带参构造，用于赋初始值
    public Dog(String name,int baoshidu){
        //继承了父类的属性
        this.baoshidu=baoshidu;
        this.name=name;
    }
    //重写父类抽象方法
    @Override
    public void feed(int num) {
        this.baoshidu+=num;
        System.out.println("狗狗"+this.name+",吃了"+num+"颗狗粮,当前饱食度为"+this.baoshidu);
    }
    //新增狗狗的特有方法
    public void dogwork(){
        System.out.println(this.name+"正在咬沙发！");
    }
}
