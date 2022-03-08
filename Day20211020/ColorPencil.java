package Day20211020;

public class ColorPencil {
    //インスタンスフィールド
    String Color;//色
    int len;//長さ
    //引数二個のコンストラクタ
	public ColorPencil(String Color, int len){
		this.Color=Color;
		this.len=len;
	}
    //インスタンスメソッド
     //書くメソッド（長さが1減る)
    public void write(){
        if(this.len<=0){
            System.out.printf("%sはもう書けません！%n",this.Color);
            return;
        }
        System.out.printf("%sで書いた!%n",this.Color);
        this.len--;
    }
     //現在の状態を表示するメソッド
    public void showInfo(){
        System.out.printf("%s",this.Color);
        for(int i=0;i<this.len;i++){
            System.out.print("-");
        }
        System.out.print(">");
    }
}
