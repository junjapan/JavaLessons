package Day20211028.joytas33;

public class Bicycle {
    int wheelSize;
    public Bicycle(int wheelSize){
        this.wheelSize=wheelSize;
    }
    public void ride(int num){
        if(num==1){
            System.out.println("風をきって走ります。");
        }else{
            System.out.println("自転車を降りました。");
        }
    }
}
