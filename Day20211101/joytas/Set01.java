package Day20211101.joytas;
import java.util.*;
public class Set01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        Set<Integer> dices = new HashSet<>();
        System.out.print("何回ふる>>");
        int num=scan.nextInt();
        for(int i=0;i<num;i++){
            int dice=rnd.nextInt(2)+1;
            System.out.println(dice);
            dices.add(dice);
        }
        if(dices.size()==1){
            System.out.println("ゾロ目です");
        }else{
            System.out.println("ぞろ目じゃないです");
        }
        scan.close();
    }
}
