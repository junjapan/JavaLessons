package Day20210921;
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        /*
        最初>5
        最後>10
        5から10までの和は45です。
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("最初>");
        final int staNum = scan.nextInt();
        System.out.print("最後>");
        final int endNum = scan.nextInt();
        //通常のやり方
        // int total = 0;
        // for(int i=staNum;i<=endNum;i++){
        //     total = total + i;
        // }
        //数学的なやり方
        int total = (staNum + endNum) * (endNum - staNum + 1) / 2;
        System.out.println(staNum + "から" + endNum + "までの和は" + total);
        scan.close();
    }
}
