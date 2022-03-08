package Day20211021;
import java.util.*;
public class Demon {
    int hp;
    int power;
    Random rnd = new Random();
    public Demon(){
        this.hp = rnd.nextInt(200)+800;
    }
    public int lightning(){
        this.power = rnd.nextInt(41)+10;
        System.out.printf("デーモンが稲妻(%d)を放った%n",this.power);
        return this.power;
    }
    public boolean attacked(Hero h){
        if(h.hp > 0){
            this.hp = this.hp - h.power;
            System.out.printf("%sは%dのダメージを与えた(Demon:%d)%n",h.name,h.power,this.hp);
        }
        if(this.hp <= 0){
            System.out.println("デーモンは朽ち果てた");
            return false;
        }else{
            return true;
        }
    }
    public void appear(){
        System.out.printf("デーモンが現れた(hp:%d)%n",this.hp);
    }
}
