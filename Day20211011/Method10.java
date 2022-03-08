package Day20211011;
import java.util.*;
import util.*;
public class Method10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] arr=Common.toCharArr("hello");
        System.out.println(Arrays.toString(arr));
        int[] arr1={1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        Common.shuffleArr(arr1);
        System.out.println(Arrays.toString(arr1));
        Common.sortArr(arr1);
        System.out.println(Arrays.toString(arr1));
        int n=Common.randRange(100,200);
        System.out.println(n);
        System.out.print("入力>");
        int n1 = scan.nextInt();
        System.out.printf("%s",Common.isZoro(n1)?"ぞろ目":"ぞろ目じゃない");
        scan.close();

    }
}
