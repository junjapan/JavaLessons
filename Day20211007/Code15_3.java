package Day20211007;

public class Code15_3 {
    public static void main(String[] args) {
        String s1="Java programming Java";
        char c=s1.charAt(1);//a
        System.out.println(c);

        System.out.println("文字列s1の４文字目以降は"+s1.substring(5));
        System.out.println("文字列s1の４～８文字目は"+s1.substring(3,8));

        String s2="apple";
        String s3=s2.toUpperCase();
        System.out.println(s3);//APPLE
        String s4="hello ";
        String s5=s4.trim();
        System.out.println(s5);//hello

        String s6=s1.replace("Java","Python");
        System.out.println(s6);
    }
}
