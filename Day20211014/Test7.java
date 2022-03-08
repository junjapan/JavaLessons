package Day20211014;

import java.util.*;
public class Test7 {
    public static void main(String[] args) {
        /*
        ペアプロジェネレータ
        実行時引数にメンバーを渡すとランダムなペアを作成する
        [実行例１]
        A B C
        [C, B]
        [A, 先生]
        [実行例２]
        A B C D
        [C, B]
        [A, D]
        */
        Random rnd = new Random();
        if(args.length==0){
            System.out.println("引数なし。メンバー名を入力してください。");
            return;
        }
        // System.out.println(args.length);
        // 各種準備
        int leng = 0;
        String[] pairPro = new String[2];
        if(args.length%2==0){
            leng = args.length;
        }else{
            leng = args.length+1;
        }
        String[] rndMen = new String[leng];
        //入力値の表示
        for(String s:args){
            System.out.printf("%s ",s);
        }
        System.out.println();
        //入力配列をランダムの並べ替え用の配列に退避
        if(args.length%2==0){
            for(int i=0;i<rndMen.length;i++){
                rndMen[i] = args[i];
            }
        }else{
            for(int i=0;i<rndMen.length-1;i++){
                rndMen[i] = args[i];
            }
            rndMen[rndMen.length-1]="先生";
        }
        //ランダムに並べ替え
        for(int i=0;i<rndMen.length-1;i++){
            int idx = rnd.nextInt(rndMen.length-i)+i;
            String tmp = rndMen[idx];
            rndMen[idx] = rndMen[i];
            rndMen[i] = tmp;
        }
        // System.out.println(Arrays.toString(rndMen));
        //偶数奇数判定して出力
        for(int i=0;i<rndMen.length/2;i++){
            for(int j=0;j<pairPro.length;j++){
                pairPro[j]=rndMen[i*2+j];
            }
            System.out.println(Arrays.toString(pairPro));
        }
    }
}
