package Day20210928;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        /*
        じゃんけんゲームを作成せよ
        ＰＣの手はランダム
        結果は
        あなたの勝ち！
        あなたの負け
        あいこ
        とする
        [実行例]
        手を選択（０：グー、１：チョキ、２：パー）>>1
        あなたはチョキ
        ＰＣはパー
        あなたの勝ち！
        */
        String[] fortunes = {"グー","チョキ","パー"};
        Random rnd = new Random();
        int pc = rnd.nextInt(fortunes.length);
        Scanner scan = new Scanner(System.in);

        System.out.println("じゃんけんゲームスタート");
        System.out.print("手を選択（０：グー、１：チョキ、２：パー）>>");
        int you = scan.nextInt();
        System.out.println("あなたは" + fortunes[you]);
        System.out.println("ＰＣは" + fortunes[pc]);
        switch(you){
            case 0:
              switch(pc){
                  case 0://グー
                  System.out.println("あいこ");
                  break;
                  case 1://チョキ
                  System.out.println("あなたの勝ち！");
                  break;
                  case 2://パー
                  System.out.println("あなたの負け");
                  break;
              }
              break;
              case 1:
              switch(pc){
                  case 0://グー
                  System.out.println("あなたの負け");
                  break;
                  case 1://チョキ
                  System.out.println("あいこ");
                  break;
                  case 2://パー
                  System.out.println("あなたの勝ち！");
                  break;
              }
              break;
              case 2:
              switch(pc){
                  case 0://グー
                  System.out.println("あなたの勝ち！");
                  break;
                  case 1://チョキ
                  System.out.println("あなたの負け");
                  break;
                  case 2://パー
                  System.out.println("あいこ");
                  break;
              }
              break;
        }

        scan.close();
    }
}
