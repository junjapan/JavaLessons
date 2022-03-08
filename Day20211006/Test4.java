package Day20211006;
import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        //各種準備
        final int GAMECOUNT = 9;
        int[] scoreTable1 = {0,0,0,0,0,0,0,1,1,2,};
        int[] scoreTable2 = {0,0,0,0,0,1,1,1,2,2,};
        int sumG = 0;
        int score = 0;
        Random rnd = new Random();
        //score処理
        for(int i=0;i<2;i++){
            int sum = 0;
            if(i==0){
                System.out.print("G|");
            }else{
                System.out.print("T|");
            }
            for(int j=0;j<GAMECOUNT;j++){
                //Ｔの９回目の実施要否判定
                if(sumG<sum&&j==8&&i==1){
                    System.out.print("x");
                }else{
                //スコア処理start
                    int idx1 = rnd.nextInt(scoreTable1.length);
                    score = scoreTable1[idx1];
                    if(score==2){
                        int idx2 = rnd.nextInt(scoreTable2.length);
                        score = score + scoreTable2[idx2];
                    }
                    //スコア処理end
                    System.out.print(score);
                    sum += score;
                }
                if((j+1)%3==0){
                    System.out.print("|");
                }
            }
            //９回裏の処理でＧとＴの合計点比較用にＧの合計点を退避。
            if(i==0){
                sumG = sum;
            }
            System.out.print(sum);
            System.out.println();
        }
    }
}
