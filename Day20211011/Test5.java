package Day20211011;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        char[] arr=toCharArr("hello");
        System.out.println(Arrays.toString(arr));
        int[] arr2={1,2,3,4,5};
        shuffleArr(arr2);
        System.out.println(Arrays.toString(arr2));
        sortArr(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static char[] toCharArr(String str){
        char[] arr = new char[str.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=str.charAt(i);
        }
        return arr;
    }
    public static void shuffleArr(int[] arr){
        Random rnd = new Random();
        for(int i=0;i<arr.length-1;i++){
            int idx = rnd.nextInt(arr.length-i)+i;
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void sortArr(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
}
