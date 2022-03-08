package Day20211005;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        /*
        */
        int[] data={3,1,5,8,2};
        //単純ソート
        for(int i=0;i<data.length-1;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]<data[j]){
                    int tmp=data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
        // バブルソート
        for(int i=0;i<data.length-1;i++){
            for(int j=data.length-1;j>i;j--){
                if(data[j] < data[j-1]){
                    int tmp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
