package java08.leideff;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("类的方法");

        System.out.println("==================");

        Movie movie=new Movie();
        movie.actors=new String[3];
        for(int i=0;i<movie.actors.length;i++){
            System.out.println("请输入第一位演员名称：");
            movie.actors[i]=input.next();
        }
        movie.showActors();
    }
}
