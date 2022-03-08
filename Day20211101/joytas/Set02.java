package Day20211101.joytas;
import java.util.*;
public class Set02 {
    public static void main(String[] args) {
        Random rnd= new Random();
        Set<Integer> dises= new HashSet<>();
        System.out.println("サイコロを繰り返しふります");
        int count=0;
        while(true){
            int num=rnd.nextInt(6)+1;
            System.out.println(num);
            dises.add(num);
            count++;
            if(dises.size()==6){
                break;
            }
        }
        System.out.printf("%d回でそろました",count);

    }
}
