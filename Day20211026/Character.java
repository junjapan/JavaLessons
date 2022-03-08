package Day20211026;

public abstract class Character {
    String name;
    int hp;
    public Character(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(this.name + "は逃げ出した");
    }
    public void attackAndAway(Matango m){
        System.out.println("アタック＆アウェイ！！");
        this.attack(m);
        this.run();
    }
    public abstract void attack(Matango m);
}
