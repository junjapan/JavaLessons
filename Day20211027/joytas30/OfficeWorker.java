package Day20211027.joytas30;

public abstract class OfficeWorker {
    String name;
    //メソッド
    public void introduce(){
        //自己紹介をする
        System.out.printf("はじめまして。私は%sです。%n",this.name);
    }
    public abstract void work();
    // public String getName(String name){
    //     //名前のゲッター
    //     return this.name;
    // }
}
