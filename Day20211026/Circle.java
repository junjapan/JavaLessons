package Day20211026;

public class Circle implements Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void calcArea(){
        System.out.println("円の面積は"+this.radius*this.radius*3.14+"です");
    }
}
