package Day20211019;

public class Hero {
    String name;
    int hp;
    //コンストラクタ（constructor）
    public Hero(String name, int hp){
        // this.name=name;
        this(name);
        this.hp=hp;
    }
    public void run(){
        System.out.println(this.name+"は逃げ出した");
    }
    //名前だけはほしい場合、オーバーロードで
    public Hero(String name){
        this.name=name;
    }
    //引数無しも設定できる
    public Hero(){}
}
