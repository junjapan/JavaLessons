package Day20211025;

public class PoisonMatango extends Matango{
    int poisonCount=5;
    public PoisonMatango(char suffix){
        super(suffix);
    }
    @Override
    public void attack(Hero h){
        super.attack(h);
        if(this.poisonCount > 0){
            System.out.println("さらに毒の胞子をばらまいた！");
            System.out.printf("%dポイントのダメージ！%n",(h.hp - h.hp/5));
            poisonCount--;
        }
    }
}
