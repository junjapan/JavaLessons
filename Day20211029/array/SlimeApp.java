package Day20211029.array;
import java.util.*;
public class SlimeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ArrayListを使ってみよう！");
        ArrayList<Slime> slimes=new ArrayList<>();
        System.out.println("Listにスライムを追加していってみよう。");
        while(true){
            System.out.print("スライムを追加する？(1…yes,2…no):");
            int num = scan.nextInt();
            if(num==1){
                System.out.print("追加するスライムの名前を決めてね:");
                String name=scan.next();
                System.out.printf("%sが現れた！！%n",name);
                Slime slime= new Slime(name);
                slimes.add(slime);
            }else if(num==2){
                break;
            }
        }
        for(Slime s:slimes){
            s.attack();
        }
        scan.close();
    }
}
