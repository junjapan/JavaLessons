package Day20211011;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        /*
        int型の引数を１つ受け取りその数の桁数を返すメソッド
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("数値>>");
        int num = scan.nextInt();
        numLength(num);
        System.out.printf("%dは%d桁の数値です%n",num,numLength(num));
        System.out.printf("%dは%sです",num,isZoro(num)?"ぞろ目":"ぞろ目ではない");
        scan.close();
    }
    public static int numLength(int num){
        // int count=0;
        // while(num>0){
        //     count++;
        //     num=num/10;
        // }
        // return count;
        // String nStr=String.valueOf(num);
        int count = String.valueOf(num).length();
        return count;
    }
    public static boolean isZoro(int n){
        if(n<10){
            return false;
        }
        char[] arr = String.valueOf(n).toCharArray();
        char first=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] != first){
                return false;
            }
        }
        return true;
    }
}
