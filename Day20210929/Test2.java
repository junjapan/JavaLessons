package Day20210929;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int num = rnd.nextInt(10);
        // System.out.println(num + "は" + (num%2==0?"偶数":"奇数") + "です");
        System.out.printf("%dは%sです%n",num,num%2==0?"偶数":"奇数");

    }
}
