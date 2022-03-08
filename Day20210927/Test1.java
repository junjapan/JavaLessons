package Day20210927;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        /*
        サイコロ何回>5
        [3,1,5,5,6]
        */
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int[] dices;

        System.out.print("サイコロ何回>");
        int count = scan.nextInt();
        dices = new int[count];
        for(int i=0;i<dices.length;i++){
            dices[i] = rnd.nextInt(6) + 1;
        }
        System.out.println(Arrays.toString(dices));
        scan.close();

    }
}
