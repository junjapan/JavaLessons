package Day20211101.animal;

public class Pig extends Animal{
    public Pig(String name){
        super(name);
    }
    public void makeNoize(){
        System.out.printf("%sはブーブー鳴いた%n",this.name);
    }
}
