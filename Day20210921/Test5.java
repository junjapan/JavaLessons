package Day20210921;
import java.util.*;
public class Test5 {
    public static void main(String[] args) {
        System.out.print("@いくつ>>");
        int max = new Scanner(System.in).nextInt();
        for(int count=1; count<=max; count++){
            if(count%10 == 0){
                System.out.println("@");
            }else{
                System.out.print("@");
            }
            /*先生の回答
            System.out.println("@");
            if(count%10 == 0){
                System.out.println();
            }
            */
        }
        System.out.println();
    }
}
