package Day20211004;
import java.util.*;
public class Test6 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[] lotos = new int[9999];
        for(int i=0;i<lotos.length;i++){
            lotos[i]=i+1;
        }
        // System.out.println(Arrays.toString(lotos));
        System.out.print("何枚買う>>");
        int num = scan.nextInt();
        int[] lotoBuy = new int[num];
        scan.close();
        // 宝くじランダムで抽選
        for(int i=0;i<num;i++){
			int index = rand.nextInt(lotos.length-i)+i;
			int tmp = lotos[index];
			lotos[index] = lotos[i];
			lotos[i] = tmp;
            lotoBuy[i] = lotos[i];
            System.out.print(lotoBuy[i]);
            if(i != num-1){
                System.out.print(",");
            }
        }
        System.out.println();
        // System.out.println(Arrays.toString(lotos));
        System.out.println("当選番号");
        int lucky = lotos[rand.nextInt(lotos.length)+1];
        System.out.println(lucky);
        int count=0;
        for(count=0;count<lotoBuy.length;count++){
            if(lotoBuy[count]==lucky){
                System.out.println("当たり");
                break;
            }
        }
        if(count>=lotoBuy.length){
            System.out.println("残念でした");
        }
    }
}
