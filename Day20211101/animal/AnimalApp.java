package Day20211101.animal;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animals={
            new Pig("John"),
            new Cat("Poal"),
            new Dog("Ringo"),
        };
        for(Animal a:animals){
            a.makeNoize();
            if(a instanceof Cat){
                ((Cat)a).sleep();
            }
        }
    }
}
