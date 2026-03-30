package jiekou.t01;

public class T01 {
    public static void main(String[] args) {
        //创建接口数组，保存需要实例化的实现类对象
        Dance[] dances=new Dance[]{new DanceStu(),new DanceTea()};
        //使用for增强循环调用数组中的实现对象中的方法
        for(Dance dance:dances){
            dance.dance();
        }
    }
}
