package Day20211008;

public class Test4 {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,6};
        for(int n:arr){
            System.out.println(n);
        }
        String[] names={"John","Paul"};
        for(String name:names){
            System.out.println(name);
        }
        String[] colors={"red","green","blue"};
        for(int i=0;i<colors.length;i++){
            System.out.printf("%s%n",colors[i]);
        }
        //絵具の場合は、c（シアン）m（マゼンダ）y（イエロー）
        int[] sum1={
            48,39,45,37,38,19,40,41,44,32,49,43,46,32,35,13,43,45,11,45,44,43,21,37,28,48,42,16,22,16,16,};
        int sum = 0;
        for(int i=0;i<sum1.length;i++){
            sum = sum + sum1[i];
        }
        System.out.println(sum);
    }
}
