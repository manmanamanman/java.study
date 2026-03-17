package yiweisz;

public class ShuZu {
    public static void main(String[] args) {
        //一维数组
        //数组：一组相同类型的变量；
        //定义数组格式：数据类型[] 数组名 = new 数据类型[大小]。如int[] a = new int[10];
        //数组赋值
        int[] a =new int[10];
        //a.length获取数组的长度
        for(int i = 0;i < a.length;i++){
            a[i] = i;
        }
        //数组读取
        for(int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
    }
}
