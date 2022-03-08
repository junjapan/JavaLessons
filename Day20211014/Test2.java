package Day20211014;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        /*
        犬の年齢を入れると人間に換算した年齢を返すメソッドdogAgeConvertHumanAgeを作成し
        以下の処理を実現せよ。なお、犬の年齢を７倍する人間の年齢に換算できる。
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("犬の年齢を入れてね>");
        int age = scan.nextInt();
        System.out.printf("犬の年齢を人間に換算した結果は%dです",dogAgeConvertHumanAge(age));
        scan.close();
    }
    public static int dogAgeConvertHumanAge(int age){
        // return 0;
        return age*7;
    }
}
