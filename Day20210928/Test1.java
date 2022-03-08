package Day20210928;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        /*
        以下のアプリを配列を作って作成せよ。
        [実行例]
        大吉

        なお、運勢は大吉、中吉、吉、凶とする。
        */
        System.out.println("運勢を占います");
        String[] fortunes = {"大吉","中吉","吉","凶",};
        Random rnd = new Random();
        // String fortune = fortunes[rnd.nextInt(4)];
        // System.out.println(fortune);
        System.out.println(fortunes[rnd.nextInt(fortunes.length)]);
    }
}
