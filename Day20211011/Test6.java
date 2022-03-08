package Day20211011;
import java.util.*;
import util.*;
public class Test6 {
    public static void main(String[] args) {
        //各種準備
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        String alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] arr = Common.toCharArr(alf);
        // int sum=0;
        //入力処理
        System.out.print("何人>");
        int num = scan.nextInt();
        int[] winSum = new int[num];

        System.out.print("何回ふる>");
        int diceCount = scan.nextInt();
        int[] dice = new int[diceCount];

        //計算と出力処理
        for(int i=0;i<num;i++){
            int sum=0;
            System.out.printf("%sさん：",arr[i]);
            for(int j=0;j<diceCount;j++){
                dice[j]=rnd.nextInt(6)+1;
                sum += dice[j];
            }
            winSum[i] = sum;
            System.out.printf("%s 合計：%d%n",Arrays.toString(dice),sum);
        }
        scan.close();
        //勝利者の出力
        int max = winSum[0];
        // int maxIdx = 0;
        //勝利者のidxを取得
        for(int i=0;i<num;i++){
            if(max < winSum[i]){
                max = winSum[i];
                // maxIdx = i;
            }
        }
        //引き分け表示
        int evenCount = 0;
        for(int i=0;i<num;i++){
            if(max==winSum[i]){
                evenCount ++;
            }
        }
        if(evenCount==num){
            System.out.println("引き分け");
        }else{
            //勝利者の表示
            // System.out.printf("%sさん",arr[maxIdx]);
            // for(int i=0;i<num;i++){
            //     if(max==winSum[i]&&maxIdx!=i){
            //         System.out.printf(",%sさん",arr[i]);
            //     }
            // }
            // System.out.printf("%sさん",arr[maxIdx]);
            for(int i=0;i<num;i++){
                if(max==winSum[i]){
                    System.out.printf("%sさん",arr[i]);
                    if(i!=num){
                        System.out.print(",");
                    }
                }
            }
            System.out.print("の勝ち");
        }
    }
}
