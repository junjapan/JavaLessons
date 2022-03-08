package Day20211025;

public class HeroApp {
    public static void main(String[] args) {
        Hero h1=new Hero();
        h1.name="ロト";
        Matango m1=new Matango('A');
        m1.attack(h1);
        h1.run();

        SuperHero h2=new SuperHero();
        h2.name="ビアンカ";
        h2.attack(m1);
        h2.fly();
        h2.land();

        Hero h3=new Hero();
        h3.attack(m1);
        h3.run();

        SuperHero h4=new SuperHero();
        h4.attack(m1);
        h4.fly();
        h4.land();
        h4.run();

        // Weapon w= new Weapon("銀のやり");

        Hero h5=new Hero();
        h5.name="ロト１";
        PoisonMatango m2=new PoisonMatango('B');
        m2.attack(h5);
        h5.run();

    }
}
