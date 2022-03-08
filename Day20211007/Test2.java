package Day20211007;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        // final String[] TOPPINGS ={
        // "大根","セロリ","里芋","カブ","ゴーヤ","キュウリ","カツオのたたき","ラム肉",
        // "鯖の水煮","ブリ","タコ","ちくわ","魚肉ソーセージ","こんにゃく","ツナ缶",
        // "納豆","アボガド","レーズン","あげ玉",
        // };
        final String[] TOPPINGS ={
            "a","b","c","d","e"
        };
        Random rand=new Random();
        Scanner sc = new Scanner(System.in);
        String[] meat = {"ポーク","ビーフ","チキン"};
        System.out.println("今夜のカレーを決めます");
        System.out.print("ベースとなるカレーを選択してください0:ポーク,1:ビーフ,2:チキン>");
        int input = sc.nextInt();
        String curry = meat[input]+"カレー";
        System.out.print("トッピングは何種類?>");
        int toppingCount=sc.nextInt();
        for(int i=0;i<Math.min(toppingCount,TOPPINGS.length);i++){
            int index = rand.nextInt(TOPPINGS.length-i)+i;
            // curry=TOPPINGS[index]+curry;
            // TOPPINGS[index]=TOPPINGS[i];
            System.out.printf("idx:%s,i:%s%n",TOPPINGS[index],TOPPINGS[i]);
            curry=TOPPINGS[index]+curry;
            TOPPINGS[index]=TOPPINGS[i];
            System.out.printf("idx:%s,i:%s%n",TOPPINGS[index],TOPPINGS[i]);
        }
        System.out.printf("今夜のカレーは「%s」に決まりました!%n",curry);
        sc.close();
    }
}
