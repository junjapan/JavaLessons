package Day20210929;
import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String name = "Apple";

        System.out.println("単語を入れてね");
        String name = scan.next(); //途中に空白あったらそこまでの文字列を処理する。
        // String name = scan.nextLine(); //行全てを取り込む。そのため途中に空白あっても処理する。

        for(int i=0;i<name.length();i++){
            char ccc = name.charAt(i);
            System.out.println(ccc);
         }

         System.out.println("数字を半角区切りでいれてね");
         int a = scan.nextInt();
         int b = scan.nextInt();
         int c = scan.nextInt();
         System.out.printf("1:%d,2:%d,3:%d,",a,b,c);
         scan.close();
 
    }
}
