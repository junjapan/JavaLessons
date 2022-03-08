package Day20211026.Code11_1;

public class Book extends TangibleAsset{
    String isbn;
    //コンストラクタ
    public Book(String name,int price,String color,String isbn){
        super(name, price, color);
        this.isbn=isbn;
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
    public String getIsbn(){
        return this.isbn;
    }
}
