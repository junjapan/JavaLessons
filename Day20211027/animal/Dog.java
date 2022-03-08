package Day20211027.animal;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeNoise(){
        System.out.println(this.name+"はワンと吠えた！");
    }
}
