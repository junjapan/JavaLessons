package Day20210921;
import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        /*
        @いくつ>>5
        @@@@@
        */
        System.out.print("@いくつ>>");
        int max = new Scanner(System.in).nextInt();
        // int count = 1;
        // while(count <= max){
            // System.out.println("@");
            // count++;
        // }
        for(int count=0; count<max; count++){
            System.out.println("@");
        }
        System.out.println();
    }
}
