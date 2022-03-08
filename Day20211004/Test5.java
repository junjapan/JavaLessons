package Day20211004;
import java.util.*;
public class Test5 {
    public static void main(String[] args) {
        Random rand= new Random();
        int[] balls={1,2,3,4,5};
        for(int i=0;i<balls.length-1;i++){
			int index = rand.nextInt(balls.length-i)+i;
			int tmp = balls[index];//選ばれたボールの番号
			balls[index] = balls[i];//最初の要素とswap
			balls[i] = tmp;            
        }
        System.out.println(Arrays.toString(balls));
    }
}
