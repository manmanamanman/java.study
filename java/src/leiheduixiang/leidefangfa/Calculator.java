package leiheduixiang.leidefangfa;

public class Calculator {
    //简易计算器，计算加减乘除
    public double calcDate(int num1, int num2, String oper) {
        double result = 0;
        switch (oper) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 * 1.0 / num2;
                break;
            default:
                result = -1;
                break;
        }
        return result;
    }
}
