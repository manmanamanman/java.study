package leiheduixiang.jicheng;

public class T01 {
    public static void main(String[] args) {
        Pet dog=new Pet();
        dog.brand="狗";
        dog.name="大黄";
        dog.age=5;
        //dog.color="黄色";  --访问不到
        System.out.println("品种："+dog.brand+",名称："+dog.name+",年龄："+dog.age);
    }
}
