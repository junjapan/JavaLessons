package Day20211027.joytas30;
import java.util.*;
public class OfficeApp {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("あなたの部下に3人配属されました");
        OfficeWorker[] officeWorker={
            new OrdinaryOfficeWorker(),
            new LazyOfficeWorker(),
            new EliteOfficeWorker(),
        };
        for(int i=0;i<officeWorker.length;i++){
            int idx = rnd.nextInt(officeWorker.length);
            OfficeWorker tmp = officeWorker[idx];
            officeWorker[idx] = officeWorker[i];
            officeWorker[i] = tmp;
        }
        for(int i=0;i<officeWorker.length;i++){
            System.out.printf("%d人目の名前を入力してください>",i+1);
            String name=scan.next();
            officeWorker[i].name=name;
            officeWorker[i].introduce();
        }
        while(true){
            System.out.println("誰の働きぶりを見にいきますか?");
            for(int i=0;i<officeWorker.length;i++){
                System.out.printf("%d・・・%s%n",i,officeWorker[i].name);
            }
            System.out.printf("%d・・・終了%n",officeWorker.length);
            System.out.print("番号を入力してください>");
            int n=scan.nextInt();
            if(n==officeWorker.length){
                scan.close();
                return;
            }else{
                officeWorker[n].work();
            }
        }
    }
}
