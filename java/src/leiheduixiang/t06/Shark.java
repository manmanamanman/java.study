package leiheduixiang.t06;

public class Shark extends Fish {
    @Override
    public int distance(int time) {
        if (time > 0) {
            return 48 * time;
        } else {
            return 0;
        }
    }
}
