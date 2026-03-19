package erweisz;

import java.util.Scanner;

public class ErWeiShuZu {
    public static void main(String[] args) {
        //二维数组
        //二维数组定义格式：数据类型[][] 数组名=new 数据类型[行数][列数]
        //试题1：输入一个正整数n，使用二维数组保存如下n*n的回型方阵并打印
//        1 1	1	1	1
//        1	2	2	2	1
//        1	2	3	2	1
//        1	2	2	2	1
//        1	1	1	1	1
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = input.nextInt();
        //定义二维数组
        int[][] a = new int[n][n];
        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = 1; j <= (n + 1) / 2; j++) {
                a[i - 1][j - 1] = Math.min(i, j);
                a[i - 1][n + 1 - j - 1] = Math.min(i, j);
                a[n + 1 - i - 1][j - 1] = Math.min(i, j);
                a[n + 1 - i - 1][n + 1 - j - 1] = Math.min(i, j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("=================");


    }
}
