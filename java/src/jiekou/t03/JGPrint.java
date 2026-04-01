package jiekou.t03;

public class JGPrint extends PrintMachine{
    @Override
    public void show() {
        System.out.println("我是激光打印机");
    }

    @Override
    public void print() {
        System.out.println("激光打印机打印中....");
    }
}
