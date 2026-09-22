package java08.leideff;

public class Movie {
    String[] actors;
    public void showActors(){
        for(int i=0;i<actors.length;i++){
            if(actors[i]!=null){
                System.out.println("第"+(i+1)+"位演员为"+actors[i]);
            }
        }
    }
}
