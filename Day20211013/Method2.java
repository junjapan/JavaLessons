package Day20211013;

import java.util.Arrays;

public class Method2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        // int[] arr = {1,2,3};
        timesArr(arr,4);
        System.out.println(Arrays.toString(arr));
        // int[] arr1 = {1,2,3,4,5};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
        int[] result=createTimesArr(arr, 3);
        System.out.println(Arrays.toString(result));
    }
    //{1,2,3}-->{3,6,9}
    public static void timesArr(int[] arr,int times){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]*times;
        }
        // System.out.println(Arrays.toString(arr));
    }
    //{1,2,3}=>{3,2,1}
    public static void reverseArr(int[] arr){
        // int[] arr1 = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     arr1[arr.length-i-1] = arr[i];
        // }
        // System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static int[] createTimesArr(int[] arr,int times){
        int[] retArr=new int[arr.length];
        for(int i=0;i<retArr.length;i++){
            retArr[i]=arr[i]*times;
        }
        return retArr;
    }
}
