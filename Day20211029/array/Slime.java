package Day20211029.array;

public class Slime {
    String name;
    public Slime(String name){
        this.name=name;
    }
    public void attack(){
        System.out.printf("%sの攻撃:5ポイントのダメージを与えた!%n",this.name);
    }
}
