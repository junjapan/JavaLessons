package Day20211006;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        //各種準備
        final String[] TOPPINGS ={
            "大根","セロリ","里芋","カブ","ゴーヤ","キュウリ","カツオのたたき","ラム肉",
            "鯖の水煮","ブリ","タコ","ちくわ","魚肉ソーセージ","こんにゃく","ツナ缶",
            "納豆","アボガド","レーズン","あげ玉",
        };
        final String[] CURRYS = {
            "ポーク",
            "ビーフ",
            "チキン",
        };
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        //メイン処理
        System.out.println("今夜のカレーを決めます");
        System.out.print("ベースとなるカレーを選択してください0:ポーク,1:ビーフ,2:チキン>");
        int curryNum = scan.nextInt();
        System.out.print("トッピングは何種類?>");
        int topNum = scan.nextInt();
        //シャッフル
        // for(int i=0;i<TOPPINGS.length-1;i++){
        for(int i=0;i<(Math.min(topNum,TOPPINGS.length)-1);i++){
                int idx = rnd.nextInt(TOPPINGS.length-i)+i;
            String tmp = TOPPINGS[idx];
            TOPPINGS[idx] = TOPPINGS[i];
            TOPPINGS[i] = tmp;
        }
        //トッピングの選択
        System.out.print("今夜のカレーは");
        for(int i=0;i<topNum;i++){
            System.out.printf("%s",TOPPINGS[i]);
        }
        System.out.printf("%sカレーに決まりました!",CURRYS[curryNum]);
        scan.close();
    }
}
