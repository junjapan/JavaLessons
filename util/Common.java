package util;
import java.util.*;
public class Common {
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
    public static int randRange(int start,int end){
        Random rnd = new Random();
        return rnd.nextInt(end-start+1)+start;
    }
    public static boolean isZoro(int n){
        if(n<10){
            return false;
        }
        char[] arr=String.valueOf(n).toCharArray();
        char first=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] != first){
                return false;
            }
        }
        return true;
    }
}
