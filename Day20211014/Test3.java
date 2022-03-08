package Day20211014;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        /*
        体重（kg）と身長（cm）を入力するとBMIを返却するメソッドを作成せよ。
        なお、BMIは
        体重（kg）／身長（m）* 身長（m）
        で求められる。

        [実行例]
        身長（cm）>>175.2
        体重（kg）>>67.2
        身長
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("身長(cm)>>");
        double hight = scan.nextDouble();
        System.out.print("体重(kg)>>");
        double weight = scan.nextDouble();
        System.out.printf("身長%.1f,体重%.1fのBMIは%.1fです",
        hight,
        weight,
        bmiCalc(hight,weight)
        );
        scan.close();

    }
    public static double bmiCalc(double hightCm, double weightKg){
        // return 0.0;
        double ans = weightKg/((hightCm/100)*(hightCm/100));
        return ans;
    }
}
