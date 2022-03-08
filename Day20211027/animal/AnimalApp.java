package Day20211027.animal;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animals={
            new Dog("John"),
            new Pig("Paul"),
            new Cat("Ringo")
        };
        for(Animal a:animals){
            a.makeNoise();
            if(a instanceof Cat){
                /*
                Cat cat = (Cat)a;
                cat.sleep();
                */
                ((Cat)a).sleep();
                /*
                ・以下はNG。なぜなら.(ドット)演算子のほうがキャスト演算子より強いため。
                (Cat)a.sleep();
                */
            }
        }
    }
}
