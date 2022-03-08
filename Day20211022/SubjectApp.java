package Day20211022;
import java.util.*;

public class SubjectApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("何科目ありますか>>");
        int num = scan.nextInt();
        Subject[] sub = new Subject[num];
        for(int i=0;i<num;i++){
            System.out.printf("%d科目目の名前>>",i+1);
            String subName = scan.next();
            System.out.printf("%d科目目の点数>>",i+1);
            int score = scan.nextInt();
            sub[i] = new Subject(subName, score);
        }
        for(int i=0;i<num;i++){
            sub[i].display();
        }
        scan.close();
    }
}
