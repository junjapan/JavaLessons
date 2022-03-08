package Day20211026;

public abstract class Character1 {
    String name;
    int hp;
    public Character1(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
    public abstract void run();
    public abstract void attack();
}
