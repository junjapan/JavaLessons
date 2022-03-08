package Day20211022.rpg;

public class Hero{
	String name;
	int hp;
	Sword sword;
	Hero(String name, int hp){
		this.name=name;
		this.hp=hp;
	}
	void attack(Demon demon){
		if(this.sword==null){
			System.out.println("武器を持っていない！！");
			return;
		}
		System.out.printf("%sはデーモンに%dのダメージを与えた！！%n",this.name,this.sword.power);
		demon.hp -= this.sword.power;
	}
}
