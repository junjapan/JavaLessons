package Day20211101.animal;

public abstract class Animal {
    String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void makeNoize();
}
