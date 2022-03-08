package Day20211018;
import java.util.*;
public class RPG3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cleric c1 = new Cleric("クレリック");
        // c1.name = "クレリック";
        // c1.selfName();
        c1.selfAid();
        c1.pray(3);
        Cleric c2 = new Cleric("クレリックジュニア");
        // c2.name = "クレリックジュニア";
        // c2.selfName();
        c2.selfAid();
        c2.pray(1);
        scan.close();
    }
}
