package Day20211004;
 import java.util.*;
public class Test7 {
    public static void main(String[] args) {
        /*
        要素が52個のストリング型配列をつくり以下の出力を実現せよ
        文字化けが発生した場合はマークを[s,d,h,c]で表すこと
        ♠1   ♠2   ♠3   ♠4   ♠5   ♠6   ♠7   ♠8   ♠9   ♠10  ♠J   ♠Q   ♠K   
        ♦1   ♦2   ♦3   ♦4   ♦5   ♦6   ♦7   ♦8   ♦9   ♦10  ♦J   ♦Q   ♦K   
        ♥1   ♥2   ♥3   ♥4   ♥5   ♥6   ♥7   ♥8   ♥9   ♥10  ♥J   ♥Q   ♥K   
        ♣1   ♣2   ♣3   ♣4   ♣5   ♣6   ♣7   ♣8   ♣9   ♣10  ♣J   ♣Q   ♣K  
        上記で作成したトランプから５枚を引いて表示せよ
        [実行例]
        ♦3 ♣6 ♠10 ♠1 ♥6
        */
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
        final int cardNumMax = 13;
        // final int cardMarkMax = 4;
        //ランダムの準備
        Random rnd = new Random();
        // ５２枚の全カードに番号を０－５１まで設定
        // この数字とカードの表示内容を紐づけ
        // int[] card = new int[MAX];
        int[] card = new int[MAX];
        for(int i=0;i<MAX;i++){
            card[i]=i;
        }

        System.out.println("全カード表示");
        for(int i=0;i<MAX;i++){
            int ma = i/cardNumMax;
            int nu = i%cardNumMax;
            // System.out.printf("%d:%2d",ma,nu);
            System.out.print(cardMark[ma] + cardNum[nu]);
            if(nu==12){
                System.out.println();
            }
        }
        System.out.println("５枚引いた結果");
        for(int i=0;i<5;i++){
            int Idx = rnd.nextInt(52-i)+i;
            int ma = card[Idx]/cardNumMax;
            int nu = card[Idx]%cardNumMax;
            // System.out.printf("%d:%2d",ma,nu);
            System.out.print(cardMark[ma] + cardNum[nu]);
            int tmp = card[Idx];
            card[Idx] = card[i];
            card[i] = tmp;
        }
    }
}
