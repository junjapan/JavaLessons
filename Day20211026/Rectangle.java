package Day20211026;

public class Rectangle implements Shape{
    int width;
    int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    @Override
    public void calcArea(){
        System.out.println("長方形の面積は"+width*height+"です");
    }
}
