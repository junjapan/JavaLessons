package Day20211029.array;
import java.util.*;
public class ArrayApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ArrayListを使ってみよう！");
        System.out.println("Listに数字をどんどん追加していってみよう。");
        ArrayList<Integer> list=new ArrayList<>();
        System.out.printf("要素数：%d",list.size());
        while(true){
            System.out.print("要素追加するよ数字を入れてね(0で終了):");
            int num=scan.nextInt();
            if(num==0){
                scan.close();
                break;
            }
            System.out.printf("%dをListに追加したよ！%n",num);
            list.add(num);
        };
        System.out.printf("要素数：%d%n",list.size());
        System.out.printf("要素：");
        for(int i:list){
            System.out.printf("%d,",i);
        }
    }
}
