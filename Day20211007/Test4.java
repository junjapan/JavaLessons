package Day20211007;

public class Test4 {
    public static void main(String[] args) {
        String s1="スッキリJava";
        String s2="Java";
        String s3="java";
        if(s2.equals(s3)){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        if(s2.equalsIgnoreCase(s3)){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        System.out.println("s1の長さは"+s1.length());
        String s4="";
        if(s4.isEmpty()){
            System.out.println("s4は空文字です");
        }
    }
}
