package Day20211011;

public class Method4 {
    public static void main(String[] args) {
        int result = sumOf(3,5);
        System.out.println(result);
        int max = maxOf(10,20);
        System.out.println(max);
        if(isEven(8)){
            System.out.println("偶数");
        }
    }
    //戻り値
    public static int sumOf(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static int maxOf(int a,int b){
        // int max = a>b ? a:b;
        // return max;
        return a>b ? a:b;
    }
    public static boolean isEven(int n){
        // boolean isEven=n % 2== 0;
        // return isEven;
        return n%2==0;
    }
}
