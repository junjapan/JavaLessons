package Day20211008;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        //各種準備
        final int monthsNum = 12;
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31,};
        int[][] sales = new int[monthsNum][]; 
        int[][] sums = new int[2][monthsNum];
        Random rnd = new Random();
        //計算処理
        for(int i=0;i<days.length;i++){
            sales[i] = new int[days[i]];
            sums[0][i] = i;
            for(int j=0;j<days[i];j++){
                int work = rnd.nextInt(41)+10;
                sums[1][i] += work;
                sales[i][j] = work;
            }
        }
        for(int i=0;i<days.length-1;i++){
            for(int j=i+1;j<days.length;j++){
                if(sums[1][i]<sums[1][j]){
                    int tmp1 = sums[1][i];
                    sums[1][i] = sums[1][j];
                    sums[1][j] = tmp1;
                    int tmp2 = sums[0][i];
                    sums[0][i] = sums[0][j];
                    sums[0][j] = tmp2;
                }
            }
        }
        //  for(int i=0;i<monthsNum;i++){
        //      System.out.println(Arrays.toString(sales[i]));
        //  }
        // System.out.println(Arrays.toString(sums));
        // System.out.println(Arrays.deepToString(sales));
        //  System.out.println(Arrays.deepToString(sums));
          System.out.println(Arrays.toString(sums[0]));
          System.out.println(Arrays.toString(sums[1]));
          System.out.printf("　１月%s%n",Arrays.toString(sales[0]));
          System.out.printf("　６月%s%n",Arrays.toString(sales[5]));
          System.out.printf("１２月%s%n",Arrays.toString(sales[11]));
        //出力処理
        for(int i=0;i<sales.length;i++){
            System.out.printf("%2d|",sums[0][i]+1);
            for(int j=0;j<sales[sums[0][i]].length;j++){
                System.out.printf(" %2s",sales[sums[0][i]][j] == 0? "*":sales[sums[0][i]][j]+"");
            }
            System.out.printf("|%4d",sums[1][i]);
            System.out.println();
        }
    }
}
