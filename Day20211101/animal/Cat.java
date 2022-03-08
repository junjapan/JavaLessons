package Day20211101.animal;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void makeNoize(){
        System.out.printf("%sはニャーニャー鳴いた%n",this.name);
    }
    public void sleep(){
        System.out.printf("%sはすやすやと寝た%n",this.name);
    }
}
