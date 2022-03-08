package Day20211026;

public class Fool extends Character1 implements Human{
    public Fool(String name,int hp){
        super(name, hp);
    }
    @Override
    public void run(){
        System.out.println(this.name+"は、逃げた");
    }
    @Override
    public void talk(){
        System.out.println(this.name+"は、話した");
    }
    @Override
    public void watch(){
        System.out.println(this.name+"は、みた");
    }
    @Override
    public void hear(){
        System.out.println(this.name+"は、聞いた");
    }
    @Override
    public void attack(){
        System.out.println(this.name+"は、戦った");
    }
}
