package Day20210928;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        /*
        大魔王討伐ゲーム
        １．実行すると攻撃力が３０－１００のランダム値を持つ戦士が１０人作成される
        ２．表示
        [65,43,91,34,,,,,,,,33]
        ３．大魔王のＨＰは800
        ４．１０人が１回ずつ攻撃をする。その際に２０％の確率でクリティカル攻撃をする。
        クリティカル攻撃は２倍の攻撃力。
        [実行例]
        １０人の戦士が集まった
        [65,43,91,34,,,,,,,,33]
        １の攻撃　６５のダメージを与えた（残：７３５）
        ２の攻撃　クリティカル！８６のダメージを与えた（残：６４９）
        １０の攻撃　３３のダメージを与えた（残：１２）
        討伐失敗！！

        */
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        final int COUNT = 10;
        final int BIGBOSS = 800;
        final int CRI = 4;
        int enemyHp = 0;
        int[] warriors = new int[COUNT];

        System.out.println(COUNT + "人の戦士が集まった");
        for(int i=0;i<warriors.length;i++){
            warriors[i] = rnd.nextInt(70+1)+30;
        }
        System.out.println(Arrays.toString(warriors));
        System.out.println("大魔王のＨＰは" + BIGBOSS);
        enemyHp = BIGBOSS;
            // ↓break使わない場合の継続条件
        for(int i=0;i<warriors.length && enemyHp>0;i++){
        // for(int i=0;i<warriors.length;i++){
            System.out.print((i+1)+"の攻撃　");
            int power = warriors[i];
            if(CRI==rnd.nextInt(5)){
                power *= 4;
                System.out.print("クリティカル！");
            }
            System.out.print(power + "のダメージを与えた");
            enemyHp -= power;
            System.out.print("（残：" + (enemyHp) + "）");
            scan.nextLine();
            // if(enemyHp<=0){
            //     break;
            // }
            // if(enemyHp <= 0){
            //     System.out.println("討伐成功");
            //     break;
            // }else{
            //     if((i+1)==warriors.length){
            //         System.out.println("討伐失敗");
            //     }
            // }
        }
        // if(enemyHp<=0){
        //     System.out.println("討伐成功");
        // }else{
        //     System.out.println("討伐失敗");
        // }
        System.out.println(enemyHp>0 ? "討伐失敗":"討伐成功");
        scan.close();
    }
}
