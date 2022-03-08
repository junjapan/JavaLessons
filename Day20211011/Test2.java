package Day20211011;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        /*
        int型の引数を１つ受け取り、１からその数までの合計を返す
        sumOfメソッドを作成せよ。
        [実行例]
        値>>10
        1から１０の合計は５５です。
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("値>>");
        int num = scan.nextInt();
        int sum = sumOf(num);
        System.out.printf("1から%dの合計は%dです",num,sum);
        scan.close();
    }
    public static int sumOf(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            // sum = sum+i;
            sum += i;
        }
        return sum;
    }
}
