package Day20210929;
import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("サイコロ何回>");
        int count = scan.nextInt();
        int[] dices = new int[count];
        int[] dices_r = new int[count];
        int j=0;

        for(int i=0;i<dices.length;i++){
            dices[i] = rnd.nextInt(6)+1;
        }
        System.out.printf("%s%n",Arrays.toString(dices));
        System.out.println("逆順にしました");
        for(int i=0;i<dices.length;i++){
            dices_r[dices.length-j-1] = dices[i];
            j += 1;
        }
        System.out.printf("%s%n",Arrays.toString(dices_r));
        scan.close();
System.out.println();
    }
}
