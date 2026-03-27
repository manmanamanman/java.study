package leiheduixiang.t06;

import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入游戏时间：");
        int time = input.nextInt();

        Shark shark = new Shark();
        int sharkdistince = shark.distance(time);
        System.out.println("鲨鱼跑了" + sharkdistince + "公里");

        Dolphin dolphin = new Dolphin();
        int dolphindistince = dolphin.distance(time);
        System.out.println("海豚跑了" + dolphindistince + "公里");

        SeaTurtle seaTurtle = new SeaTurtle();
        int seaturtledistince = seaTurtle.distance(time);
        System.out.println("海龟跑了" + seaturtledistince + "公里");
    }
}
