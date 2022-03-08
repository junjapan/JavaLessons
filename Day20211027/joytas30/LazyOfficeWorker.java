package Day20211027.joytas30;

public class LazyOfficeWorker extends OfficeWorker{
    //メソッド
    @Override
    public void work(){
        //怠惰なオフィスワーカーの働きぶりを書く
        System.out.printf("%sはPCの画面を即座に切り替えた。何をしていたのだろう。%n",this.name);
    }
}
