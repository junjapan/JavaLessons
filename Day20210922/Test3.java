package Day20210922;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        /*
        何段>>5
        #
        ##
        ###
        ####
        #####
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("何段>>");
        int maxCount = scan.nextInt();
        for(int i=0;i<maxCount;i++){
            for(int j=0;j<(i+1);j++){
                System.out.print("#");
            }
            System.out.println();
        }
        scan.close();
    }
}
