package Day20211005;
import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        int[] balls = new int[100];
        int winA = 0;
        int winB = 0;
        for(int i=0;i<balls.length;i++){
            balls[i] = i;
        }
        Random rnd = new Random();
        //先行後攻決め
        int first = rnd.nextInt(2);
        //５回勝負
        for(int i=0;i<50;i++){
            // System.out.println("first:" + first);
            System.out.printf("%d回戦",i+1);
            int num = i*2;
            for(int j=num;(num+j)<2;j++){
                int idx = rnd.nextInt(balls.length-i)+i;
                int tmp = balls[idx];
                balls[idx] = balls[i];
                balls[i] =  tmp;
            }
            // Aは、0
            // Bは、1
            if(first==0){
                if(balls[num]>balls[num+1]){
                    winA += 1;
                }else{
                    winB += 1;
                }
                System.out.printf("A:%d,B:%d…%sの勝ち%n",balls[num],balls[num+1],balls[num]>balls[num+1]?"A":"B");
            }else{
                if(balls[num]>balls[num+1]){
                    winB += 1;
                }else{
                    winA += 1;
                }
                System.out.printf("A:%d,B:%d…%sの勝ち%n",balls[num+1],balls[num],balls[num]>balls[num+1]?"B":"A");
            }
        }
        System.out.printf("%d対%dで%sの勝ち",winA,winB,winA>winB?"A":"B");
    }
}
