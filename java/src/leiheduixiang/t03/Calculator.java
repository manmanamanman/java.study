package leiheduixiang.t03;

public class Calculator {
    //计算器
    int[] score = new int[3];

    public int total(){
        int totalscore=0;
        for(int i=0;i<score.length;i++){
            totalscore+=score[i];
        }
        return totalscore;
    }

    /**
     * 求平均值
     *
     */
    public String avg() {
        //注意：同一个类中，方法之间可以互相调用
        String result = String.format("%.2f",(total() * 1.0 / score.length));
        return result;
    }

    /**
     * 求最大值
     *
     */
    public int max() {
        int maxscore = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > maxscore) {
                maxscore = score[i];
            }
        }
        return maxscore;
    }

    /**
     * 求最小值
     *
     */
    public int min() {
        int minscore = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] < minscore) {
                minscore = score[i];
            }
        }
        return minscore;
    }
}
