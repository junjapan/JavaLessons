package Day20211011;
import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        /*
        素数の判定
        */
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
