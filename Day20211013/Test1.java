package Day20211013;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /*
        ２つのint型配列を受け取り、その2つの配列をマージした配列を
        返却するメソッドmergeArrを作成せよ
        [1,2,3,4],[10,11,12]
        =>[1,2,3,4,10,11,12]

        引数にint型の２次元配列を受け取り、要素の総和を返すメソッドsumOfを作成せよ
        {{1,2,3},{4,5}} -> 15
        */
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {10,11,12};
        int[] result=mergeArr(arr1, arr2);
        System.out.println(Arrays.toString(result));
        int[][] arr3 = {{1,2,3},{4,5,6,7}};
        System.out.println(sumOf(arr3));
        //countOfArr
        String[] data={"apple","apple","orange","pine","apple","apple","apple","orange"};
        String str="apple";
        int n=countOfArr(data,str);
        System.out.printf("%sは%d個%n",str,n);
        int n1 = 10;
        int a=0;
        a = n1++ + n1++;
        System.out.printf("aは%d%n",a);
        System.out.printf("n1は%d%n",n1);
    }
    public static int[] mergeArr(int[] arr1,int[] arr2){
        int[] retArr=new int[arr1.length+arr2.length];
        for(int i=0;i<retArr.length;i++){
            if(i < arr1.length){
                retArr[i]=arr1[i];
            }else{
                retArr[i]=arr2[i-arr1.length];
            }
        }
        return retArr;
    }
    public static int sumOf(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        // 拡張for文は以下
        // for(int[] ar : arr){
        //     for(int n : ar){
        //       sum += n;
        //     }
        // }
        return sum;
    }
    /*
    引数に文字列型配列と文字列を受け取り、その文字列が最初に現れるindexを返却する。
    もしなかった場合は-1を返却する。
    indexOfArr
    String[] data={"apple","banana","orange"}
    indexOfArr(data,"banana")  ->1
    indexOfArr(data,"pine")    ->-1
    */
    public static int indexOfArr(String[] arr,String str){
        for(int i=0;i<arr.length;i++){
            if(str.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
    /*
    引数に文字列型配列と文字列を受け取り、配列内に含まれる文字列の個数を求めるメソッドcountOfArr
    String[] data={"apple","apple","orange","pine"};
    countOfArr(data,"apple") ->2
    */
    public static int countOfArr(String[] arr, String str){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(str.equals(arr[i])){
                count ++;
            }
        }
        return count;
    }
}
