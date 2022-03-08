package Day20210921;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        /*
        実行例１
        あなたは４
        ＰＣは２
        あなたの勝ち
        実行例２
        あなたは３
        ＰＣは３
        引き分け
        */
        final int dice = 6;
        int you = new Random().nextInt(dice) +1;
        int pc  = new Random().nextInt(dice) +1;
        System.out.println("あなたは" + you);
        System.out.println("ＰＣは" + pc);
        if(you == pc){
            System.out.println("引き分け");
        }else if(you > pc){
            System.out.println("あなたの勝ち");
        }else{
            System.out.println("あなたの負け");
        }
    }
}
