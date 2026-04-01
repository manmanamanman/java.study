package jiekou.t04;

public class ZhengFangXing implements SumArea{
    int height;
    public ZhengFangXing(){

    }
    public ZhengFangXing(int height){
        this.height=height;
    }
    @Override
    public void sumArea() {
        System.out.println("正方形面积为:"+height*height);
    }
}
