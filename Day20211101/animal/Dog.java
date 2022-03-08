package Day20211101.animal;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void makeNoize(){
        System.out.printf("%sはワンワン鳴いた%n",this.name);
    }
}
