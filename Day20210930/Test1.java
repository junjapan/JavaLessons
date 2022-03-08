package Day20210930;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        /*
        年齢>23
        名前>matsu sho
        matsu sho(23)さん、こんにちは！
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("年齢>");
        // int age = scan.nextInt();
        int age = scan.nextInt();scan.nextLine();
        System.out.print("名前>");
        String name = scan.nextLine();
        System.out.printf("%s(%d)さん、こんにちは！",name,age);
        scan.close();
    }
}
