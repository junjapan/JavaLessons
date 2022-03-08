package Day20211026;

public class Goblin extends WalkingMonster{
    public Goblin(int hp,int mp){
        super(hp, mp);
    }
    @Override
    public void attack(){
        System.out.println("ナイフで切り付ける");
    }
}
