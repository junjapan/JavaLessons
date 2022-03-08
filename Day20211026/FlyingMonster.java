package Day20211026;

public abstract class FlyingMonster extends Monster {
    public FlyingMonster(int hp, int mp){
        super(hp, mp);
    }
    @Override
    public void run(){
        System.out.println("バサバサ飛んで逃げる");
    }
}
