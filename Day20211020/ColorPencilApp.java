package Day20211020;
import java.util.*;
public class ColorPencilApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("何本作成しますか>>");
        int num = scan.nextInt();
		ColorPencil[] cs = new ColorPencil[num];
        for(int i=0;i<num;i++){
            System.out.printf("%d本目の色>>",i+1);
            String Color = scan.next();
            System.out.printf("%d本目の長さ>>",i+1);
            int len = scan.nextInt();
            ColorPencil cp = new ColorPencil(Color,len);
			cs[i]=cp;
        }
        // cs[0].showInfo();
        while(true){
            System.out.println("--操作を入力--");
            for(int i=0;i<cs.length;i++){
                System.out.printf("%d.",i);
                cs[i].showInfo();
                System.out.println();
            }
            System.out.printf("%d.終了%n",cs.length);
            System.out.print(">>");
            int num1 = scan.nextInt();
            scan.close();
            if(num1==cs.length){
                return;
            }
            cs[num1].write();
        }
    }
}
