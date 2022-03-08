package Day20210929;
import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        /*
        サイコロ何回>5
        [1,2,1,5,5]
        最小1
        最大6
        */
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("サイコロ何回>");
        int count = scan.nextInt();
        int[] dices = new int[count];
        int max=1;
        int min=6;
        int sum=0;

        for(int i=0;i<dices.length;i++){
            dices[i] = rnd.nextInt(6)+1;
            if(max<dices[i]){
                max=dices[i];
            }
            if(min>dices[i]){
                min=dices[i];
            }
            sum += dices[i];
        }
        System.out.printf("%s（合計：%d）%n",Arrays.toString(dices),sum);
        System.out.println("max" + max);
        System.out.println("min" + min);
        scan.close();
    }
}
