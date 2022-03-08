package Day20211019;

public class Monkey {
    String name;
    int age;
    //コンストラクタ
    public Monkey(String name,int age){
        this.name=name;
        this.age=age;
    }
    //メソッド
    public void greed(){
        System.out.printf("こんにちはトシ(%d才)です。よろしく！%n",this.age);
    }
    public void takeuma(){
        System.out.printf("%sは上手に竹馬にのった！%n",this.name);
    }
    public void sakadachi(){
        System.out.printf("%sはひょいと逆立ちをした！%n",this.name);
    }
}
