package jiekou.t02;

public class Div implements Calculator {
    @Override
    public double calc(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 * 1.0 / num2;
        }
    }
}
