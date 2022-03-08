package Day20211018;

public class RPGApp {
    public static void main(String[] args) {
        Hero h1=new Hero();
        h1.name="ロト";
        h1.hp=100;
        h1.slip();
        h1.sit(3);
        h1.slip();
        h1.sleep();
        h1.run();
        Hero h2=new Hero();
        h2.name="ジェシカ";
        h2.hp=100;
        h2.slip();
    }
}
