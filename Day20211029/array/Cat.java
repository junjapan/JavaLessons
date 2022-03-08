package Day20211029.array;
import java.util.*;
public class Cat {
    //static field 任意
    //instance field
    char[] types = {'A','B','C'};
    char type;
    String name;
    int intimacy;
    //コンストラクタ
    // public Cat(char type){
    //     this.type=type;
    // }
    //method
    public void join(){
        System.out.printf("%s joined!%n",this.name);
    }
    public void appear(){
        Random rnd=new Random();
        int idx= rnd.nextInt(types.length);
        char str =types[idx];
        System.out.printf("%s-type cat appeared!%n",str);
    }
    @Override
    public String toString(){
        return this.name+"["+this.type+"]"+"("+this.intimacy+")";
    }
    public void play(){
        System.out.printf("Playing with %s%n",this.name);
        System.out.println("・・・");
        this.intimacy++;
        System.out.println("Intimacy is up!!");
    }
}
