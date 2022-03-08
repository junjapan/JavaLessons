package Day20211020;
import java.util.*;
public class MonkeyApp2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("何匹おさるを集める？>>");
		int n = sc.nextInt();sc.nextLine();
		Monkey[] ms = new Monkey[n];
		for(int i=0;i<ms.length;i++){
			System.out.print("おさるの名前>>");
			String name=sc.nextLine();
			System.out.print("おさるの年齢>>");
			int age=sc.nextInt();sc.nextLine();
		    Monkey mk = new Monkey(name,age);
			ms[i]=mk;
		}
		for(Monkey m:ms){
	       m.greet();
		}
		System.out.println("全部で" + Monkey.getTotalCount());
		sc.close();
	}
}
