package Day20210927;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[5];
        System.out.println(scores.length);//要素数->5
        scores[0] = 20;
        scores[1] = 30;
        scores[2] = 40;
        scores[3] = 50;
        scores[4] = 60;

        System.out.println(scores[0]);  //20

        int sum=0;
        for(int i=0;i<scores.length;i++){
            sum = sum + scores[i]; //sum += scores[]
        }
        System.out.println("合計は" + sum);
        System.out.println("平均は" + sum/scores.length);

        int[] sales = {120,200,300,150};
        System.out.println(sales[0]);//120
        System.out.println(sales.length);//4

        int sumSales=0;
        for(int i=0;i<sales.length;i++){
            sumSales += sales[i];
        }
        
        System.out.println("合計は" + sumSales);
        System.out.println("平均は" + sumSales/scores.length);
        System.out.println(Arrays.toString(sales));
    }
}
