package leiheduixiang.t06;

public class Dolphin extends Fish{
    @Override
    public int distance(int time) {
        if (time > 0) {
            return 60 * time;
        } else {
            return 0;
        }
    }
}
