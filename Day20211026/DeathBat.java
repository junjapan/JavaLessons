package Day20211026;

public class DeathBat extends FlyingMonster{
    public DeathBat(int hp,int mp){
        super(hp, mp);
    }
    @Override
	public void attack(){
		System.out.println("突っつく");
	}
}
