package Day20210930;
import java.util.*;
public class Test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Random   rnd = new Random();
        int classNum=0;
        int num=0;

        System.out.println("実行結果");
        System.out.print("クラスの数>");
        classNum = scan.nextInt();
        int[][] school = new int[classNum][];
        for(int i=0;i<school.length;i++){
            System.out.printf("%d組のクラスの人数>",(i+1));
            num = scan.nextInt();
            // arr[1] = new int[]{80,60,70,60,};
            /*
            int[] arr = new int[num];
            data[i] = arr;
            */
            school[i] = new int[num];
            for(int j=0;j<num;j++){
                System.out.printf("%d組%d人目の点数>",(i+1),(j+1));
                school[i][j] = scan.nextInt();
            }
        }
        System.out.println("--表出力--");
        for(int i=0;i<school.length;i++){
            System.out.printf("%d組 ",(i+1));
            for(int j=0;j<school[i].length;j++){
                System.out.printf("%4d",school[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
