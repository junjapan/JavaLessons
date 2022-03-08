package Day20211015;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        /*
        引数にString型配列を受け取り、そのうちの一つをランダムに返すメソッドrandomChoiceを作成し、
        以下の処理を作成せよ
        [実行例]
        明後日ボノボが世界の中心でサイヤ人になった
        */
        // String[] when = {"今日","昨日の晩","明後日","遠い昔"};
        // String[] who = {"私が","猫が","ボノボが","クリスティアーノ・ロナウドが"};
        // String[] where = {"六本木で","飲み屋で","世界の中心で","マングローブで"};
        // String[] what = {"叫んだ","サイヤ人になった","ガチャで爆死した","吐いた"};

        String[][] arr = {
            {"今日","昨日の晩","明後日","遠い昔"},
            {"私が","猫が","ボノボが","クリスティアーノ・ロナウドが"},
            {"六本木で","飲み屋で","世界の中心で","マングローブで"},
            {"叫んだ","サイヤ人になった","ガチャで爆死した","吐いた"}
            /*
            "今日、昨日の晩、明後日、遠い昔".split("、"),
            "私が、猫が、ボノボが、クリスティアーノ・ロナウドが".split("、"),
            "六本木で、飲み屋で、世界の中心で、マングローブで".split("、"),
            "叫んだ、サイヤ人になった、ガチャで爆死した、吐いた".split("、")
            */
        };
        for(int i=0;i<arr.length;i++){
            System.out.print(randomChoice(arr[i]));
        }
    }
    public static String randomChoice(String[] arrStr){
        Random rnd = new Random();
        int idx = rnd.nextInt(arrStr.length);
        return arrStr[idx];
    }
}
