package Day20211020;
import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("おさるの名前>>");
		String name=sc.nextLine();
		System.out.print("おさるの年齢>>");
		int age=sc.nextInt();
		// Monkeインスタンスを生成
		Monkey mk = new Monkey(name,age);
		while(true){
			System.out.print("おさるに何をさせますか？1...挨拶,2...竹馬,3...逆立ち,4...終了>>");
			int select = sc.nextInt();
			switch(select){
			case 1:
				mk.greet();
				break;
			case 2:
				mk.takeuma();
				break;
			case 3:
				mk.sakadachi();
				break;
			case 4:
				System.out.println("終了");
				sc.close();
				return;
			}
		}
	}
}
