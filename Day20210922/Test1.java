package Day20210922;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        /*
        1～100の乱数の中から３または５で割り切れるものを指定個数作成して合計を求める
        何個>>5
        15
        80
        21
        35
        55
        合計はxxx
        */
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("何個>>");
        int maxCount = scan.nextInt();
        int sum = 0;
        int count = 0;
        while(true){
            int n = rnd.nextInt(100) + 1;
            if(n%3==0 || n%5==0){
                System.out.println(n);
                sum += n;
                count++;
                if(count >= maxCount){
                    break;
                }
            }
        }
        System.out.println("合計は" + sum);
        scan.close();
    }
}
