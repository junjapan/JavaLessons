package Day20211025;

public class Item {
    String name;
    int price;
    //public Item(){};
    public Item(String name){
        this.name=name;
    }
    public Item(String name,int price){
        this(name);
        this.price=price;
    }
}
