package Day20211027.animal;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void makeNoise(){
        System.out.println(this.name+"はニャーとないた");
    }
    public void sleep(){
        System.out.println(this.name+"はすやすやと眠った");
    }
}
