package Day20210922;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        /*
        1～10の乱数を指定個数作成して合計を求める
        何個>>5
        4
        1
        8
        8
        2
        合計は23
        */
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("何個>>");
        int count = scan.nextInt();
        int sum = 0;
        for(int i=0;i<count;i++){
            int n = rnd.nextInt(10) + 1;
            System.out.println(n);
            sum += n;
            // sum = sum + rnd;
        }
        System.out.println("合計は" + sum);
        scan.close();
    }
}
