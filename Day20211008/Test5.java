package Day20211008;
import java.util.*;
public class Test5 {
    public static void main(String[] args) {
        // int[][] table ={
        //     {1,0,0,0,2,0,0,0},
        //     {1,1,0,0,0,0,0,0},
        //     {1,1,0,0,0,2,0,0},
        //     {1,1,0,0,0,0,0,0},
        //     {1,1,1,0,0,0,0,3},
        //     {1,1,0,0,0,0,3,3},
        //     {1,0,0,0,0,0,0,0},
        // };
        //各種準備
        final int rowMax = 5;
        final int colMax = 9;
        String[] maps={"地","海","岩","木"};
        String[] directions={"東","西","南","北"};
        int[][] mapTable = new int[rowMax][colMax];
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        //マップと宝の座標のランダム設定
        //マップ
        for(int i=0;i<mapTable.length;i++){
            for(int j=0;j<mapTable[i].length;j++){
                mapTable[i][j] = rnd.nextInt(maps.length);
                int num = mapTable[i][j];
                System.out.print(maps[num]);
            }
            System.out.println();
        }
        //宝の座標と方角をランダム設定
        int treasureRow = rnd.nextInt(rowMax);
        int treasureCol = rnd.nextInt(colMax);
        //宝のヒント
        System.out.printf("%sの上にあります。",maps[mapTable[treasureRow][treasureCol]]);
        System.out.printf("北に岩があります。");
        //座標入力
        int inRow = scan.nextInt();
        int inCol = scan.nextInt();
        //座標の一致判定
    }
}
