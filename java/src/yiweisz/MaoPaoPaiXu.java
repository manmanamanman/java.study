package yiweisz;

public class MaoPaoPaiXu {
    public static void main(String[] args) {
        //冒泡排序
        //冒泡排序本质是二重循环
        //外层的最大值为数组元素-1，内层比较次数为数组元素-外层当前值。即内层比较次数总额为比较次数+循环次数=数组长度

        //试题1：将该数组{124,56,78,34,89}，按冒泡排序降序输出。
        int[] a={124,56,78,34,89};
        int temp;   //替换变量
        //外层最大可循环（5-1）=4次，从0开始，可取最大值为（4-1）=3
        for(int i=0;i<(a.length-1)-1;i++){
            //内层最大可循环（5-i）次，从0开始，可取最大值为（5-i）-1
            for(int j=0;j<(a.length-i)-1;j++){
                temp=a[j];
                if(a[j]<a[j+1]){
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
