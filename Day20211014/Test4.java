package Day20211014;
import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        /*
        int型の引数を２つ受け取り、その範囲を要素にする配列を返却するメソッドを作成せよ。
        数値>>7
        数値>>2
        [7,6,5,4,3,2]
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("数値>>");
        int num1 = scan.nextInt();
        System.out.print("数値>>");
        int num2 = scan.nextInt();
        System.out.println(Arrays.toString(arrRange(num1,num2)));
        scan.close();
    }
    public static int[] arrRange(int num1,int num2){
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);
        // System.out.println(num1);
        // System.out.println(num2);
        // System.out.println(max);
        // System.out.println(min);
        int[] arr = new int[max-min+1];
        if(num1<num2){
            for(int i=0;i<arr.length;i++){
                arr[i]=min+i;
            }
        }else{
            for(int i=0;i<arr.length;i++){
                arr[i]=max-i;
            }
        }
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
}
