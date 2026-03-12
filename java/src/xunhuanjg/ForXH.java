package xunhuanjg;

public class ForXH {
    public static void main(String[] args) {
        //for循环
        //试题1：求1+2+3+4+...+100的值
        int num = 0;
        for(int i=1;i<=100;i++){
            num = num + i;
        }
        System.out.println("1+2+3+4+...+100的和为:"+num);

        System.out.println("===================");

        //试题2：求100以内的奇数和、偶数和
        int num1 = 0;
        int num2 = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                num1 = num1 + i;
            }else{
                num2 = num2 + i;
            }
        }
        System.out.println("100以内奇数和为:"+num1+",偶数和为:"+num2);

        System.out.println("===================");

        //试题3：求1*2+2*3+3*4+...+99*100的值
        int num3 = 0;
        for(int i=1;i<100;i++){
            num3 += i*(i+1);
        }
        System.out.println("1*2+2*3+3*4+...+99*100的值为:"+num3);

        System.out.println("===================");

        //break、continue与return的区别
        //break:跳出当前最近的循环，执行后续语句；
        //continue:跳出本次循环，进行下一次循环；
        //return:结束所在的方法。方法中若是无返回值类型，则直接retrun即可，否则return后加返回值；
    }
}
