package Day20211015;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("実行時に名前をいれてください");
            return;
        }
        String[] data;//今回の主役となる配列
        if(args.length % 2 == 0){
            data=args;
        }else{
            data = new String[args.length+1];
            for(int i=0;i<args.length;i++){
                data[i]=args[i];
            }
            data[data.length-1]="先生";
        }
        //シャッフル
        Random rnd = new Random();
        for(int i=0;i<data.length-1;i++){
            int idx = rnd.nextInt(data.length-i)+i;
            String tmp=data[idx];
            data[idx]=data[i];
            data[i]=tmp;
        }
        //出力
        for(int i=0;i<data.length/2;i++){
            System.out.printf("[%s,%s]%n",data[i],data[data.length-1-i]);
        }
    }
}
