package Day20210929;
import java.util.*;
public class NamePower {
    public static void main(String[] args) {
        char[] chars = {'渡','辺','純','市'};
        int power =0;
        for(char c : chars){
            power += c;
        }
        System.out.println("渡辺純：" + power/chars.length);
        //seed値を設定することによって毎回同じ結果が得られる
        // 
        Random rnd = new Random(power+300);
        String[] fortunes={"大吉","中吉","吉","凶",};
        int index=rnd.nextInt(fortunes.length);
        System.out.printf("今日のあなたの運勢は%sです%n",fortunes[index]);
    }
}
