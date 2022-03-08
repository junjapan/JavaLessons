package Day20210921;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        /*
        犬の名前>>Paul
        Paulの年齢>>3
        Paulは人間の年齢に換算すると21歳です。
        */
        System.out.print("犬の名前>>");
        String dogName = new Scanner(System.in).nextLine();
        System.out.print(dogName + "の年齢>>");
        int dogAge  = new Scanner(System.in).nextInt();
        System.out.println(dogName + "は人間の年齢に換算すると" + (dogAge*7) + "歳です。");
    }
}
