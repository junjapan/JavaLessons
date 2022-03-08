package Day20211006;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        //各種準備
        Random rnd = new Random();
        //ボール配列
        int[] balls=new int[100];
        for(int i=0;i<balls.length;i++){
            balls[i]=i;
        }
        //配列シャッフル
        for(int i=0;i<balls.length-1;i++){
            int idx =rnd.nextInt(balls.length-i)+i;
            int tmp=balls[idx];
            balls[idx]=balls[i];
            balls[i]=tmp;
        }
        // System.out.println(Arrays.toString(balls));
        int aWin=0,bWin=0;//勝ち星管理変数
        //メイン処理
        for(int i=0;i<5;i++){
            System.out.printf("%d回戦%n",i+1);
            int aBall=balls[i];
            int bBall=balls[balls.length-1-i];
            String winner;
            if(aBall>bBall){
                aWin++;
                winner="A";
            }else{
                bWin++;
                winner="B";
            }
            System.out.printf("A:%d,B:%d...%sの勝ち%n",aBall,bBall,winner);
        }
        System.out.printf("%d対%dで%sの勝ち",Math.max(aWin,bWin),Math.min(aWin,bWin),aWin>bWin?"A":"B");
    }
}
