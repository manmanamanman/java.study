package leiheduixiang.leidefangfa;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 2;
        String oper = "+";
        double result = calculator.calcDate(num1, num2, oper);
        System.out.println(result);
    }
}
