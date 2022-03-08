package Day20211021;
import java.util.*;
public class Hero {
    //死んだ人数
    static int deathCount=0;
    String name;
    int hp;
    int power;

    public Hero(String name){
        Random rnd = new Random();
        this.name = name;
        this.hp = rnd.nextInt(70)+30;
        this.power = rnd.nextInt(50)+50;
    }
    //メソッド
    //攻撃受けた時の挙動
    public boolean attacked(int lightning){
        if(this.hp > 0){
            this.hp -= lightning;
            System.out.printf("%sは%dのダメージを受けた(hp:%d)%n",this.name,lightning,this.hp);
            if(this.hp <= 0){
                System.out.printf("%sは力尽きた%n",this.name);
                deathCount++;
            }
        }
        if(deathCount >= 10){
            System.out.println("ヒーローたちは全滅した");
            return false;
        }
        return true;
    }
    public void showInfo(){
        System.out.printf("%s(hp:%d,power:%d)%n",this.name,this.hp,this.power);
    }
}
