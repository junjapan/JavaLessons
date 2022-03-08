package Day20211026.Code11_1;

public class Computer extends TangibleAsset{
    String makerName;
    //コンストラクタ
    public Computer(String name,int price,String color,String makerName){
        super(name, price, color);
        this.makerName=makerName;
    }
    //メソッド
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int getPrice(){
        return this.price;
    }
    @Override
    public String getColor(){
        return this.color;
    }
    public String getMakerName(){
        return this.makerName;
    }
}
