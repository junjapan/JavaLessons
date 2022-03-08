package Day20211004;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        int[][] data={
            {2,3,4},
            {12,13,14},
            {22,23,24},
            {32,33,34},
        };
        for(int[] arr : data){
            System.out.println(Arrays.toString(arr));
        }
        int[][][] data2 = new int[2][3][4];
        for(int[][] arr:data2){
            for(int[] arr2:arr){
                System.out.println(Arrays.toString(arr2));
            }
            System.out.println("-------");
        }

    }
}
