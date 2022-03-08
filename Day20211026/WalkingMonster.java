package Day20211026;

public abstract class WalkingMonster extends Monster{
    public WalkingMonster(int hp,int mp){
        super(hp, mp);
    }
    @Override
    public void run(){
        System.out.println("とことこ走って逃げる");
    }
}
