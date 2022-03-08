package Day20211014;

public class Test6 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("引数なし");
        }else{
            int sum=0;
            // System.out.println(args.length);
            for(String s:args){
                sum += Integer.parseInt(s);
                // System.out.println(s);
            }
            System.out.println("合計は"+sum);
        }
    }
}
