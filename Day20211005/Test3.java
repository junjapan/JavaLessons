package Day20211005;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        /*
        1-10000をランダムに１０００個作成する
        その中で２番目に大きい値を出力せよ
        [実行例]
        10000,9996
        */
        long start=System.currentTimeMillis();
        Random rnd = new Random();
        //要素1000個の１次配列
        int[] rndNum = new int[1000];
        for(int i=0;i<rndNum.length;i++){
            rndNum[i]=rnd.nextInt(10000)+1;
            // rndNum[i]=10000;
        }
        //降順ソート
        for(int i=0;i<rndNum.length-1;i++){
            for(int j=i+1;j<rndNum.length;j++){
                if(rndNum[i]<rndNum[j]){
                    int tmp=rndNum[i];
                    rndNum[i]=rndNum[j];
                    rndNum[j]=tmp;
                }
            }
        }
        // rndNum[1] = rndNum[0];
        // rndNum[2] = rndNum[0];
        // System.out.println(Arrays.toString(rndNum));
        for(int i=0;i<10;i++){
            System.out.println(rndNum[i]);
        }
        System.out.println("実行結果");
        int[] ans = new int[2];
        ans[0] = rndNum[0];
        for(int i=0;i<rndNum.length;i++){
            if(ans[0]!=rndNum[i]){
                ans[1]=rndNum[i];
                break;
            }
        }
        System.out.printf("%5d,%5d%n",ans[0],ans[1]);
        long end=System.currentTimeMillis();
        System.out.println(start);
        System.out.println(end);
        System.out.println(end-start);
    }
}
