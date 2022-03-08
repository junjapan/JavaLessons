package Day20211028.rpg;

public class Hero {
    private String name;
    private int hp;
    public Hero(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setHp(int hp){
        this.hp=hp;
    }
    public int getHp(){
        return this.hp;
    }
}
