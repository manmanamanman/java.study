package trycatch.t01;

import java.util.Scanner;

public class ChuLing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("除数为:");
        int num1 = input.nextInt();

        System.out.print("被除数为:");
        int num2 = input.nextInt();

        double result;
        try {
            result = num1 / num2;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("程序结束");
        }
    }
}
