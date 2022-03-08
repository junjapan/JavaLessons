package Day20211101;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        //昇順ソート
        int[] data={3,2,3,6,1,5};
        for(int i=0;i<data.length-1;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]>data[j]){
                    int tmp=data[j];
                    data[j]=data[i];
                    data[i]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
