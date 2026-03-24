package leiheduixiang.chouxiangandfengzhuang;

public class GouZaoFunc {
    //属性
    String name;
    String brand;
    int age;
    //构造方法
    public  GouZaoFunc(String name,String brand,int age){
        this.name=name;
        this.brand=brand;
        this.age=age;
    }
    //方法
    public void show(){
        System.out.println("品种："+brand+",姓名："+name+",年龄："+age);
    }
}
