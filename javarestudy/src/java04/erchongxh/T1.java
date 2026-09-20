package java04.erchongxh;

public class T1 {
    public static void main(String[] args) {
        System.out.println("二重循环");

        System.out.println("=============");

        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=============");

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=============");

        for(int i=1;i<=5;i++){
            for(int k=1;k<=(5-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=============");

        int num=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        System.out.println("=============");

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
        System.out.println("=============");

        for(int i=1;i<=33;i++){
            for(int j=1;j<=50;j++){
                for(int k=1;k<=100;k++){
                    if((i+j+k)==100&&(3*i+2*j+k*1.0/3)==100){
                        System.out.println("公鸡："+i+"只，"+"母鸡："+j+"只,"+"小鸡："+k+"只");
                    }
                }
            }
        }
    }
}
