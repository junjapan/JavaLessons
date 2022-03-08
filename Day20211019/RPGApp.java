package Day20211019;

public class RPGApp {
    public static void main(String[] args) {
        Hero h1= new Hero("ロト",100);
        Hero h2= new Hero("ジェシカ",80);
        h1.run();
        h2.run();
        Hero h3 = new Hero("ジョン");
        h3.run();
    }
}
