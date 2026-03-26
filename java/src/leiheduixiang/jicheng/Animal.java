package leiheduixiang.jicheng;

public class Animal {
    //父类
    String brand;
    private  String color;

    public Animal(){
        System.out.println("父类构造");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
