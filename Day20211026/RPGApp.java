package Day20211026;

public class RPGApp {
    public static void main(String[] args){
        // Character c = new Character();
        Matango m = new Matango();
        Dancer d = new Dancer("ビアンカ");
        // d.name="ビアンカ";
        d.dance();
        d.attack(m);
        d.run();
        d.attackAndAway(m);
    }
}
