package Day20211027.joytas30;

public class EliteOfficeWorker extends OfficeWorker{
    //メソッド
    @Override
    public void work(){
        //エリートオフィスワーカーの働きぶりを書く
        System.out.printf("%sは仕事がはやい！しかも正確だ。%n",this.name);
    }
}
