package Day20211011;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        /*
        底辺と高さの値を引数で受取り、三角形の面積を表示するメソッドを作成し、
        以下の処理を実現せよ（表示は小数2桁）
        [実行例]
        底辺>5.2
        高さ>3.6
        底辺5.2 高さ3.6の三角形の面積はxx.xxです
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("底辺>");
        Double w = scan.nextDouble();
        System.out.print("高さ>");
        Double h = scan.nextDouble();
        calcTriangleArea(w,h);
        scan.close();
    }
    public static void calcTriangleArea(Double w,Double h){
        Double area=w*h/2;
        System.out.printf("底辺%.2f 高さ%.2fの三角形の面積は%.2f",w,h,area);
    }
}
