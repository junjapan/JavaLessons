package Day20211026.Code11_1;

public abstract class TangibleAsset extends Asset{
    /*
    ア.Asset
    イ.IntangibleAsset
    ウ.Patent
    */
    String color;
    //コンストラクタ
    public TangibleAsset(String name,int price,String color){
        super(name, price);
        this.color=color;
    }
    //メソッド
    public String getName(){
        return this.name;
    };
    public int getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
}
