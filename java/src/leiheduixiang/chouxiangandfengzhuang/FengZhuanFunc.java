package leiheduixiang.chouxiangandfengzhuang;

public class FengZhuanFunc {
    //将属性设置为私有属性，只能该类中访问
    private String name;
    private int age;

    //为私有属性提供公有的getter和setter方法
    public void setName(String name) {
        //提前处理不合法数据
        if (age < 0) {
            age = 0;
        }
        this.name = name;  //this.name是上面新增的私有变量，name为传值
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age) {
        //提前处理不合法数据
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
