package Day20211027.animal;

public abstract class Animal {
    String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void makeNoise();
}
