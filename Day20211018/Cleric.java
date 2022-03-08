package Day20211018;
import java.util.*;
public class Cleric {
    String name;
    int hp=50;
    final int HPMAX=50;
    int mp=10;
    final int MPMAX=10;
    //コンストラクタ(Constructor)
    public Cleric(String name){
        this.name=name;
    }
    public Cleric(String name, int hp){
        this(name);
        this.hp=hp;
    }
    public Cleric(String name, int hp, int mp){
        this(name);
        this.mp=mp;
    }
    //セルフエイド
    public void selfAid(){
        if(this.mp < 5){
            System.out.println("MPが足りない");
            return;
        }
        this.mp -= 5;
        this.hp = this.HPMAX;
        System.out.println("魔法セルフエイドを使うよ");
        System.out.printf("最大HP%dまで回復した%n",this.HPMAX);
    }
    public int pray(int sec){
        Random rnd = new Random();
        int mpTmp = sec + rnd.nextInt(3);
        if(mpTmp>this.MPMAX){
            mpTmp = this.MPMAX;
        }
        this.mp = mpTmp;
        // int recov = Math.min(MPMAX-this.mp,temp);
        System.out.printf("%d秒お祈りをしたよ%n",sec);
        System.out.printf("MPが%d回復した%n",this.mp);
        return this.mp;
    }
    // public void selfName(){
    //     System.out.printf("僕の名前は%Sだよ%n",this.name);
    //     System.out.printf("聖職者になったからhp:%d、mp:%dになったよ%n",this.hp,this.mp);
    // }
}
