package Day20210930;
import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        /*
        何行>>2
        何列>>3
        22 31 89
        91  3 90
        */
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("何行>>");
        int row = scan.nextInt();
        System.out.print("何列>>");
        int col = scan.nextInt();
        //２次元配列
        int[][] data = new int[row][col];
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                data[i][j] = rnd.nextInt(99)+1;
            }
        }
        //出力
         for(int i=0;i<data.length;i++){
             for(int j=0;j<data[i].length;j++){
                 System.out.printf("%3d",data[i][j]);
             }
             System.out.println();
         }
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                System.out.printf(Arrays.toString(data[i]));
            }
            System.out.println();
        }
        scan.close();
    }
}
