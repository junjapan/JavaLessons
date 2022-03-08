package Day20211007;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] teamNames={"G","T"};
        int gTotal=0,tTotal=0;
        for(int i=0;i<2;i++){
          System.out.print(teamNames[i]+"|");
          for(int j=1;j<=9;j++){
            if(i==1 && j==9 && gTotal<tTotal){
              System.out.print("X");
            }else{
              int n = rand.nextInt(100);
              int score;
              if(n<2){
               score=4;
              }else if(n<5){
                score=3;
              }else if(n<10){
                score=2;
              }else if(n<30){
                score=1;
              }else{
                score=0;
              }
              if(i==0){
                gTotal+=score;
              }else{
                tTotal+=score;
              }
              System.out.print(score);
            }
            if(j%3==0){
              System.out.print("|");
            }
          }
          System.out.printf("%d%n",i==0? gTotal:tTotal);
        }
    }
}
