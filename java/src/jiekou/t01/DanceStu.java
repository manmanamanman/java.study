package jiekou.t01;

public class DanceStu implements Dance{
    //子类继承父类使用extends;实现类实现接口使用implements;
    @Override
    public void dance() {
        System.out.println("舞蹈学生正在跳舞!");
    }
}
