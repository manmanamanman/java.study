package xunhuanjg;

public class DoWhileXH {
    public static void main(String[] args) {
        //do-while循环
        //先执行，后判断，至少执行一次
        //试题1：A和B同时报数，A按1~20报数，B按1~30报数，以相同速度报数，当两人都报了1000个数时，同时报相同数的次数是多少
        int a,b;
        a = b = 0;   //A和B报的数字，因为还没开始报，所以赋值为0
        int num = 0; //两人同时同速报的次数
        int sum = 0; //报相同数的次数
        do{
            num++;
            a++;
            b++;
            if(a > 20){
                a = 1;
            }
            if(b > 30){
                b = 1;
            }
            if(a == b){
                sum++;
            }
        }while (num < 2);
        System.out.println("相同的数一共报了:"+sum+"次");
    }
}
