package Day20210929;
import java.util.*;
public class NamePower1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name>>"); 
        String name= sc.nextLine();
        long seed=0L;
        for(int i=0;i<name.length();i++){
           char c = name.charAt(i);
           seed += (int)c;
        }
        System.out.println(seed);
        //実行日時のカレンダーインスタンス生成
        Calendar cal = Calendar.getInstance();
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        //シード値に日付情報を追加
        seed = seed + year + month + date;
        //ランダムインスタンス生成
        Random rand = new Random(seed);
        //運勢配列
        String[] fortunes={
           "大吉",
           "中吉",
           "吉",
           "凶",
        };
        //結果
        int index = rand.nextInt(fortunes.length);
        System.out.printf("あなたの%d/%d/%dの運勢は%sです%n",year,month+1,date,fortunes[index]);
        sc.close();
     } 
}
