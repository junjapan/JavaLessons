package Day20210917;
import java.util.*;
public class Ex3_5 {
    public static void main(String[] args){
        System.out.println("[メニュー]１：検索２：登録３：削除４：変更＞");
        Scanner sc = new Scanner(System.in);
        int selected = sc.nextInt();
        switch(selected){
            case 1:
            System.out.println("検索します");
            break;
            case 2:
            System.out.println("登録します");
            break;
            case 3:
            System.out.println("削除します");
            break;
            case 4:
            System.out.println("変更します");
            break;
            default:
            System.out.println("");
        }
        sc.close();
    }
}
