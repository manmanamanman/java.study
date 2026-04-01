package jiekou.t04;

public class JuXing implements SumArea{
    //矩形
    int height;
    int wight;
    public JuXing(){

    }
    public JuXing(int height,int wight){
        this.height=height;
        this.wight=wight;
    }
    @Override
    public void sumArea() {
        System.out.println("该矩形面积为:"+height*wight);
    }
}
