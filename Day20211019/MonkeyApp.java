package Day20211019;
import java.util.*;
public class MonkeyApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("おさるの名前を決めてください:>");
        String name = scan.next();
        System.out.print("おさるの歳を決めてください:>");
        int age = scan.nextInt();
        Monkey m1 = new Monkey(name,age);
        // Hero h1 = new Hero(name);
        // scan.close();
        while(true){
            System.out.print("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
            int mDo = scan.nextInt();
            System.out.println();
            switch(mDo){
                case 1:
                    m1.greed();
                    break;
                case 2:
                    m1.takeuma();
                    break;
                case 3:
                    m1.sakadachi();
                    break;
                case 4:
                    break;
                // case 5:
                //     h1.run();
                //     break;
                default:
                    break;
            }
            if(mDo==4){
                System.out.println("アプリケーションを終了します。");
                break;
            }

        }
        scan.close();
    }
}
