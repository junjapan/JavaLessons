package Day20211011;

public class Method6 {
    public static void main(String[] args) {
        int num=1;
        int result=tenTimes(num);
        System.out.println(result);//10
        System.out.println(num);//1
    }
    public static int tenTimes(int n){
        n=n*10;
        return n;
    }
}
