package jiekou.t03;

public class ZSPrint extends PrintMachine{
    @Override
    public void show() {
        System.out.println("我是针式打印机");
    }

    @Override
    public void print() {
        System.out.println("针式打印机打印中....");
    }
}
