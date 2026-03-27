package leiheduixiang.t06;

public class SeaTurtle extends Fish{
    @Override
    public int distance(int time) {
        if (time > 0) {
            return 20 * time;
        } else {
            return 0;
        }
    }
}
