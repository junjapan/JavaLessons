package Day20211021;
public class HerosApp {
    public static void main(String[] args) {
        //各種準備
        Demon dm = new Demon();
        //デーモンの初期値設定
        dm.appear();
        System.out.println("ヒーローが集まった");
        Hero[] hr = new Hero[10];
        String[] arr = {"A","B","C","D","E","F","G","H","I","J","k","l","m","n",};
        //ヒーローの初期値設定
        for(int i=0;i<hr.length;i++){
            hr[i] = new Hero(arr[i]);
            hr[i].showInfo();
        }
        //ゲームが終わるまでループスタート
        while(true){
            //デーモンの攻撃内容
            dm.lightning();
            //デーモンの攻撃、ヒーローが攻撃受ける
            for(int i=0;i<hr.length;i++){
                if(!hr[i].attacked(dm.power)){
                    return;
                }
            }
            System.out.println("--ヒーローたちの攻撃--");
            //ヒーローの攻撃、デーモンが攻撃受ける
            for(int i=0;i<hr.length;i++){
                if(!dm.attacked(hr[i])){
                    return;
                }
            }
        //ゲームが終わったらループエンド
        }
}
}
