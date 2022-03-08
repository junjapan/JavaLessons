package Day20211005;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        String[] cardNum = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "J",
            "Q",
            "K",
        };
        String[] cardMark = {"♠","♦","♥","♣",};
        final int MAX = 52;
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        String[] card = new String[MAX];

        System.out.println("全カード表示");
        for(int i=0;i<cardMark.length;i++){
            for(int j=0;j<cardNum.length;j++){
                int idx = i*13+j;
                card[idx]=cardMark[i] + cardNum[j];
                System.out.printf("%4s",card[idx]);
            }
            System.out.println();
        }
        System.out.println("----------------");
        for(int i=0;i<MAX;i++){
            card[i]=cardMark[i/13]+cardNum[i%13];
            System.out.printf("%4s",card[i]);
            if((i+1)%13==0){
                System.out.println();
            }
        }
        System.out.print("何枚>");
        int num = scan.nextInt();
        System.out.println("引いたカード");
        for(int i=0;i<num;i++){
            int idx = rnd.nextInt(card.length-i)+i;
            String tmp = card[idx];
            card[idx] = card[i];
            card[i] = tmp;
            System.out.printf("%4s",tmp);
        }
        scan.close();
    }
}
