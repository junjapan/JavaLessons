package Day20211022.rpg;

import java.util.*;
public class RPGApp{
	public static void main(String[] args){
		Sword[] swords=new Sword[3];
		swords[0]=new Sword("ひのきの棒",10);
		swords[1]=new Sword("鉄の剣",40);
		swords[2]=new Sword("ダイヤの剣",120);
		Hero h = new Hero("ロト",120);
		System.out.printf("%sは冒険にでかけた%n",h.name);
		Random rand = new Random();
		int idx=rand.nextInt(swords.length);
		System.out.printf("なんと%sを見つけた！%n",swords[idx].name);
		h.sword=swords[idx];
		//h.sword=null;
		Demon demon=new Demon();
		System.out.printf("デーモン(%d)が現れた！%n",demon.hp);
		while(demon.hp > 0){
			h.attack(demon);
		}
		System.out.println("世界に平和が訪れた！");
	}
}
