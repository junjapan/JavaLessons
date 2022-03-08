package Day20211008;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        //各種準備
        final int monthsNum = 12;
        // final int daysNum = 31;
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31,};
        int[][] sales = new int[monthsNum][]; 
        int[] sums = new int[monthsNum];
        Random rnd = new Random();
        //計算処理
        for(int i=0;i<days.length;i++){
            sales[i] = new int[days[i]];
            for(int j=0;j<days[i];j++){
                int tmp = rnd.nextInt(41)+10;
                sums[i] += tmp;
                sales[i][j] = tmp;
            }
        }
        //  for(int i=0;i<monthsNum;i++){
        //      System.out.println(Arrays.toString(sales[i]));
        //  }
        // System.out.println(Arrays.toString(sums));
        // System.out.println(Arrays.deepToString(sales));
        //出力処理
        for(int i=0;i<sales.length;i++){
            System.out.printf("%2d|",i+1);
            for(int j=0;j<sales[i].length;j++){
                System.out.printf(" %2s",sales[i][j] == 0? "*":sales[i][j]+"");
            }
            // System.out.printf("|%4s",String.valueOf(sums[i]));
            System.out.printf("|%4d",sums[i]);
            System.out.println();
        }
    }
}
