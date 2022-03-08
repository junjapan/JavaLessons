package Day20211013;

import java.util.*;
import util.*;
public class Test2 {
    public static void main(String[] args) {
        //各種準備
        String[] selfStatus = {"体力","魔力","パワー","きようさ","すばやさ"};
        String[] tribes = {"人間","ハイエルフ","トロル","ノーム"};
        String[] jobs = {"戦士","盗賊","僧侶","魔術師"};
        //体力,魔力
        int min1 = 1,max1 = 100;
        //パワー,きようさ,すばやさ
        int min2 = 1,max2 = 50;
        //各種ボーナス
        int[][] tribesBonus = {
            {10,10,10,10,10},
            { 0,20, 0,10,20},
            {30, 0,20, 0, 0},
            {10, 0, 0,25,20},
        };
        double[][] jobsBonus = {
            {1.6,1.0,1.4,1.0,1.0},
            {1.1,1.0,1.2,1.3,1.3},
            {1.3,1.5,1.1,1.0,1.0},
            {1.0,1.9,1.0,1.0,1.1},
        };
        //インスタンス準備
        Scanner scan = new Scanner(System.in);
        //入力処理
        System.out.print("名前を入力してください>");
        String name = scan.nextLine();
        char[] nameArr = Common.toCharArr(name);
        int power =0;
        for(char c : nameArr){
            power += c;
        }
        System.out.println("シード値" + power);
        Random rnd = new Random(power);
        System.out.println("初期ステータスが決定しました");
        // for(int i=0;i<selfStatus.length;i++){
        //     if(selfStatus[i]="体力" || "魔力"){
        //         int[] selfStatusNum = rnd.nextInt();
        //     }else{
        //         int[] selfStatusNum = rnd.nextInt();
        //     }
        // }
        // statusLayout(selfStatus,);
        //終了処理
        scan.close();

    }
    public static void statusLayout(String[] hed,int[] num){
        //  return {"A","A"};
        // String[] arr=0;
        System.out.print("[");
        for(int i=0;i<hed.length;i++){
            System.out.printf("%s:%d",hed[i],num[i]);
        }
        System.out.print("]");
    }
}
