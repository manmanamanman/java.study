package java06.erweisz;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        System.out.println("二维数组");

        System.out.println("================");

        Scanner input=new Scanner(System.in);

        int[][] shuzu=new int[10][10];
        int[][] shuzu1=new int[10][10];
        int num=0;
        System.out.print("请输入行数：");
        int hang=input.nextInt();
        System.out.print("请输入列数：");
        int lie=input.nextInt();

        for(int i=0;i<hang;i++){
            for(int j=0;j<lie;j++){
                shuzu[i][j]=num;
                num++;
            }
        }
        for(int i=0;i<hang;i++){
            for(int j=0;j<lie;j++){
                System.out.print(shuzu[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<hang;i++){
            for(int j=0;j<lie;j++){
                shuzu1[j][i]=shuzu[hang-i-1][j];
//                [0][0]=[1][0]
//                [1][0]=[1][1]
//                [2][0]=[1][2]
//
//                [0][1]=[0][0] [2][0]
//                [1][1]=[0][1] [2][1]
//                [2][1]=[0][2] [2][2]
            }
        }
        for(int i=0;i<lie;i++){
            for(int j=0;j<hang;j++){
                System.out.print(shuzu1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<lie;i++){
            for(int j=hang-1;j>=0;j--){
                System.out.print(shuzu[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
