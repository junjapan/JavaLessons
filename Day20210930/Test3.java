package Day20210930;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("サイコロ何回>");
        int count = scan.nextInt();
        int[] dices = new int[count];
        // int[] dices_r = new int[count];
         
        for(int i=0;i<dices.length;i++){
            dices[i] = rnd.nextInt(6)+1;
        }
        System.out.printf("%s%n",Arrays.toString(dices));
        System.out.println("逆順にしました");
        for(int i=0;i<(count/2);i++){
            int tmp = dices[i];
            dices[i] = dices[count-1-i];
            dices[count-1-i] = tmp;
        }
        System.out.printf("%s%n",Arrays.toString(dices));
        scan.close();
    }
}
