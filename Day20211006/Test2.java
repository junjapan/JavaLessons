package Day20211006;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        int[] balls = new int[100];
        int winA = 0;
        int winB = 0;
        //番号設定
        for(int i=0;i<balls.length;i++){
            balls[i] = i;
        }
        Random rnd = new Random();
        //５回勝負
        for(int i=0;i<50;i++){
            // System.out.println("first:" + first);
            System.out.printf("%d回戦",i+1);
            int num = i*2;
            for(int j=num;j<(num+2);j++){
                int idx = rnd.nextInt(balls.length-i)+i;
                int tmp = balls[idx];
                balls[idx] = balls[j];
                balls[j] =  tmp;
            }
            // int idx = rnd.nextInt(balls.length-i)+i;
            // int tmp = balls[idx];
            // balls[idx] = balls[num];
            // balls[num] =  tmp;
            // int idx = rnd.nextInt(balls.length-i)+i;
            // int tmp = balls[idx];
            // balls[idx] = balls[num+1];
            // balls[num+1] =  tmp;
            if(balls[num]>balls[num+1]){
                winA += 1;
            }else{
                winB += 1;
            }
            System.out.printf("A:%d,B:%d…%sの勝ち%n",balls[num],balls[num+1],balls[num]>balls[num+1]?"A":"B");
        }
        // System.out.printf("%d対%dで%sの勝ち",winA,winB,winA>winB?"A":"B");
        if(winA>winB){
            System.out.printf("%d対%dでAの勝ち",winA,winB);
        }else if(winA==winB){
            System.out.printf("%d対%dで引き分け",winA,winB);
        }else{
            System.out.printf("%d対%dでBの勝ち",winA,winB);
        }
    }
}
