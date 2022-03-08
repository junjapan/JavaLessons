package Day20211028.rpg;

public class RPGApp {
    public static void main(String[] args) {
        Hero hero = new Hero("ロト", 100);
        Wand wand = new Wand();
        wand.setName("清風の杖");
        wand.setPower(5);
        Wizard wizard = new Wizard();
        wizard.setName("ビアンカ");
        wizard.setHp(80);
        wizard.setMp(30);
        wizard.setWand(wand);
        //
        System.out.println("ヒーローのＨＰは" + hero.getHp() + "だ");
        wizard.heal(hero);
        System.out.println("ヒーローのＨＰは" + hero.getHp() + "になった");
        System.out.println(wizard.toString());
        Wand w2=new Wand();
        w2.setName("清風の杖");
        w2.setPower(5);
        if(wand==w2){
        }else{
            System.out.println("２つのインスタンスは違います");
        }
        if(w2.equals(wand)){
            System.out.println("２つのインスタンスは等価です");
        }else{
            System.out.println("２つのインスタンスは違います");
        }
    }
}
