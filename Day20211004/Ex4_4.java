package Day20211004;
import java.util.*;
public class Ex4_4 {
    public static void main(String[] args) {
        int[] numbers = {3,4,9};
        Scanner scan = new Scanner(System.in);
        System.out.println("１桁の数字を入力してください");
        int input = scan.nextInt();
        boolean isHit = false;
        for(int n:numbers){
            if(n==input){
                isHit = true;
                break;
            }
            isHit = true;
            break;
        }
        System.out.println(isHit==true? "アタリ！":"はずれ");
        scan.close();
    }
}
