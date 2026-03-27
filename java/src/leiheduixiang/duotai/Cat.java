package leiheduixiang.duotai;

public class Cat extends Pet{
    public Cat(){

    }
    //自定义带参构造，用于赋初始值
    public Cat(String name,int baoshidu){
        //继承了父类的属性
        this.baoshidu=baoshidu;
        this.name=name;
    }
    @Override
    public void feed(int num) {
        this.baoshidu+=num;
        System.out.println("猫猫"+this.name+",吃了"+num+"颗猫粮,当前饱食度为"+this.baoshidu);
    }
    //新增猫猫的特有方法
    public void catwork(){
        System.out.println(this.name+"正在抓老鼠！");
    }
}
