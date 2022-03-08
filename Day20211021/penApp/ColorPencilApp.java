package Day20211021.penApp;
import java.util.*;
public class ColorPencilApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("何本作成しますか>>");
		int n=sc.nextInt();
		ColorPencil[] cps=new ColorPencil[n];
		for(int i=0;i<cps.length;i++){
			System.out.printf("%d本目の色>>",i+1);
			String color=sc.next();
			System.out.printf("%d本目の長さ>>",i+1);
			int len=sc.nextInt();
			ColorPencil cp=new ColorPencil(color,len);
			cps[i]=cp;
		}
		while(true){
			System.out.println("--操作を入力--");
			for(int i=0;i<=cps.length;i++){
				System.out.printf("%d.",i);
				if(i == cps.length){
					System.out.println("終了");
				}else{
					cps[i].showInfo();
				}
			}
			System.out.print(">>");
			int select = sc.nextInt();
			if(select >= cps.length){
				System.out.println("アプリケーションを終了します");
				sc.close();
				return;
			}
			cps[select].write();
		}
	}
}
