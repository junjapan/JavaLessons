package Day20210922;
import java.util.*;

public class Test5 {
    public static void main(String[] args) {
    /*
    行と列を指定するとその表を1-9の乱数で満たす処理を作成せよ
    何行>>2
    何列>>3
    2 9 8
    7 7 1
    */
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    System.out.print("何行>>");
    final int maxLow = scan.nextInt();
    System.out.print("何列>>");
    final int maxCol = scan.nextInt();
    for(int i=0;i<maxLow;i++){
        for(int j=0;j<maxCol;j++){
            int n = rnd.nextInt(9)+1;
            System.out.print(n + " ");
        }
        System.out.println();
    }
    scan.close();
  }
}
