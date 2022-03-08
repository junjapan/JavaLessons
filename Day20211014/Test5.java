package Day20211014;

public class Test5 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("引数なし");
        }else{
            for(String s:args){
                System.out.println(s);
            }
        }
    }
}
