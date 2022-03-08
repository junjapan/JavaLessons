package Day20210927;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        /*
        一週間分の体重を記録するよ
        １日目>67.2
        ２日目>68.2
        ３日目>67.1

        ７日目>66.2
        平均体重：67.1111223323
        */
        Scanner scan = new Scanner(System.in);
        final int WEEK = 7;
        double[] weights = new double[WEEK];
        double sum=0d;
        // double weight;

        System.out.println("一週間分の体重を記録するよ");
        for(int i=0;i<WEEK;i++){
            System.out.print((i+1) + "日目>");
            weights[i] = scan.nextDouble();
            sum += weights[i];
        }
        System.out.println("平均体重：" + sum/WEEK);
        System.out.println(Arrays.toString(weights));
        scan.close();
    }
}
