package Day20211108;

import java.util.*;
public class DQW {
    public static void main(String[] args) {
        final Scanner SC = new Scanner(System.in);
        Map<Card,Integer> cards=new LinkedHashMap<>(){
            {
                put(new Card('S',  3, 240), 0);
                put(new Card('A',  5,  48), 0);
                put(new Card('B', 10,  12), 0);
                put(new Card('C', 30,   3), 0);
                put(new Card('D', 52,   1), 0);
            }
        };
        System.out.println("---合成シミュレーター---");
        while(true){
            System.out.println("0:カードを引く");
            System.out.println("1:カードを合成する");
            System.out.println("2:カードをセットする");
            System.out.println("3:シミュレーションする");
            System.out.println("4:終了");
            System.out.print(">>");
            int n= SC.nextInt();
            switch(n){
                case 0:
                    Card card = drawCard(cards);
                    System.out.println(card.rank + "が出ました！");
                    int num = cards.get(card);
                    cards.put(card, num+1);
                    showCards(cards);
                    break;
                case 1:
                    System.out.println("合成しました！");
                    int point = totalPoint(cards);
                    changeCards(cards, point);
                    showCards(cards);
                    break;
                case 2:
                    System.out.println("カードを任意枚数にセットします");
                    System.out.println("0,2,1,3,4 のように");
                    System.out.println("カンマ区切りでS,A,B,C,Dの枚数を入力してください");
                    System.out.print(">>");
                    // String setNums=SC.next();
                    // String[] sNum = setNums.split(",");
                    String[] sNum = SC.next().split(",");
                    int[] numArr = new int[sNum.length];
                    for(int i=0;i<sNum.length;i++){
                        // numArr[i] = Integer.valueOf(sNum[i]);
                        numArr[i] = Integer.parseInt(sNum[i]);
                    }
                    setCards(cards, numArr);
                    System.out.println("指定枚数でセットしました");
                    showCards(cards);
                    break;
                case 3:
                    System.out.println("現在の状況からSが指定枚数できるまでの回数をシミュレーションします");
                    System.out.print("Sの必要枚数を入力>>");
                    int s = SC.nextInt();
                    System.out.print("シミュレーション回数を入力>>");
                    int simNum=SC.nextInt();
                    Map<Integer,Integer> simMap= new TreeMap<>();
                    simMap = simCards(cards, simNum, s);
                    simShowCards(simMap);
                    break;
                case 4:
                default:
                    SC.close();
                    return;
            }
        }
    }

    static void showCards(Map<Card,Integer> cards){
        for(Card c:cards.keySet()){
            System.out.printf("%s(%d)",c.rank,cards.get(c));
        }
        System.out.println();
    }

    static void simShowCards(Map<Integer,Integer> simMap){
        int sum=0;
        int total=0;
        for(int c:simMap.keySet()){
            System.out.printf("%3d(%3d):",c,simMap.get(c));
            for(int i=0;i<simMap.get(c);i++){
                System.out.print("*");
            }
            System.out.println();
            sum += simMap.get(c);
            total += c*simMap.get(c);
        }
        System.out.printf("平均：%.1f回%n",(double)total/sum);
    }

    static Map<Integer,Integer> simCards(Map<Card,Integer> cards,int simNum,int sNum){
        //メソッドチェーンを使ってＳポイントを取得
        int sPoint=cards.keySet().iterator().next().point;
        Map<Integer,Integer> simMap= new TreeMap<>();
        System.out.print("現在の状態：");
        showCards(cards);
        System.out.println("S枚数からの換算ポイント："+sNum*sPoint);
        for(int i=0;i<simNum;i++){
            int simTPoint=totalPoint(cards);
            int simSNum=0;
            while(simTPoint<sNum*sPoint){
                Card card=drawCard(cards);
                simTPoint += card.point;
                simSNum ++;
                // System.out.println("引いたカード：" + card.rank+"、"+simSNum+"枚目");
            }
            // System.out.println("シミュレーション回数："+(i+1));
            if(simMap.get(simSNum)==null){
                simMap.put(simSNum, 1);
            }else{
                simMap.replace(simSNum, simMap.get(simSNum)+1);
            }
        }
        return simMap;
    }

    static void setCards(Map<Card,Integer> cards,int[] num){
        int i=0;
        for(Card c:cards.keySet()){
            if(i<num.length){
                // cards.replace(c, num[i]);
                // i++;
                cards.put(c, num[i++]);
            }
        }
    }

    static int totalPoint(Map<Card,Integer> cards){
        int total=0;
        //合計point算出
        for(Card c:cards.keySet()){
            total += c.point*cards.get(c);
            // System.out.println("total:"+total+",point:"+c.point+",cards.get:"+cards.get(c));
        }
        // System.out.println("合計："+total);
        return total;
    }

    static void changeCards(Map<Card,Integer> cards, int total){
        //合成算出
        for(Card c:cards.keySet()){
            // cards.replace(c, total/c.point);
            cards.put(c, total/c.point);
            total %= c.point;
        }
    }

    static Card drawCard(Map<Card,Integer> cards){
        Card card=null;
        int n=(int)(Math.random()*100);
        for(Card c:cards.keySet()){
            if(n - c.ratio < 0){
                card=c;
                break;
            }
            n -= c.ratio;
        }
        return card;
    }
}

class Card{
    Character rank;
    int ratio;
    int point;
    Card(Character rank,int ratio,int point){
        this.rank=rank;
        this.ratio=ratio;
        this.point=point;
    }
}