package Day20211018;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("word>>");
        String word=scan.next();
        for(int i=0;i<2;i++){
            System.out.print(word);
        }
        System.out.println();
        scan.close();
    }
}
