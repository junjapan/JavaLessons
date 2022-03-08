package Day20211027.joytas30;

public class OrdinaryOfficeWorker extends OfficeWorker{
    //メソッド
    @Override
    public void work(){
        //普通のオフィスワーカーの働きぶりを書く
        System.out.printf("%sは９時から５時まで働いている。遅刻や欠勤はない%n",this.name);
    }
}
