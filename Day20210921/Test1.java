package Day20210921;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        /*
        数あてゲーム
        1-100の範囲の乱数を生成したよ。当ててね。
        いくつかな＞＞４０
        もっと上だよ
        いくつかな＞＞８０
        もっと下だよ
        */
        int count = 0;
        System.out.println("数あてゲーム");
        System.out.println("1-100の範囲の乱数を生成したよ。当ててね。");
        final int rnd = new Random().nextInt(100 - 1 + 1) + 1;

        while(true){
            System.out.print("いくつかな>>");
            int num = new Scanner(System.in).nextInt();
            // System.out.println("入力値"+ num + "：乱数値" + rnd);
            count++;
            if(num == rnd){
                System.out.println("当たり！！");
                System.out.println(count + "回で当てました。");
                break;
            }else if(num > rnd){
                System.out.println("もっと下だよ");
            }else{
                System.out.println("もっと上だよ");
            }
        }
    }
}
