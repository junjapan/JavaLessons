package Day20211028.rpg;


public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    public void heal(Hero h){
        int basePoint=10;
        int recoverPoint=(int)(basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recoverPoint);
        System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
    }
    public void setHp(int hp){
        this.hp=Math.max(0, hp);
    }
    public int getHp(){
        return this.hp;
    }
    public void setMp(int mp){
        this.mp=Math.max(0, mp);
    }
    public int getMp(){
        return this.mp;
    }
    public void setName(String name){
        if(name.length() < 3){
            throw new IllegalArgumentException("名前が短すぎる。処理を中断");
        }
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setWand(Wand wand){
        if(wand==null){
            throw new IllegalArgumentException("杖を設定してください");
        }
        this.wand=wand;
    }
    public Wand getWand(){
        return this.wand;
    }
    // @Override
    // public String toString(){
    //     return String.format("名前：%s,HP:%d,MP:%d",this.name,this.hp,this.mp);
    // }
}
