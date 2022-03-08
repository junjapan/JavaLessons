package Day20210922;
import java.util.*;
public class Test6 {
    public static void main(String[] args) {
        /*
        チャンスは１０回さて、７７はでるか！
        「実行例」
        1:43
        2:72
        3:77
        ３回目に７７がでました！
        「実行例」
        1:43
        2:72
        ・
        10:32
        ７７は出ませんでした
        */
        Random rnd = new Random();
        boolean lucky = false;

        System.out.println("チャンスは１０回さて、７７はでるか！");
        for(int i=1;i<=10;i++){
            int n = rnd.nextInt(99); 
            System.out.println(i + ":" + n);
            if(n==77){
                lucky = true;
                System.out.println(i + "回目に７７が出ました");
                break;
            }
        }
        if(lucky==false){
            System.out.println("７７は出ませんでした");
        }
    }
}
