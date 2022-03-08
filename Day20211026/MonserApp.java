package Day20211026;

public class MonserApp {
    public static void main(String[] args) {
        //432ページの多階層の抽象継承構造の説明
        Goblin g = new Goblin(10, 10);
        g.attack();
        g.run();
        Werewolf w = new Werewolf(20, 20);
        w.attack();
        w.run();
        DeathBat d = new DeathBat(5, 5);
        d.attack();
        d.run();
        // WalkingMonster w1 = new WalkingMonster(1,1);

    }
}
