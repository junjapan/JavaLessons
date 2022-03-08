package Day20211007;

public class Code15_2 {
    public static void main(String[] args) {
        String s1="Java adn JavaScript";
        if(s1.contains("Java")){
            System.out.println("文字列Javaは含まれます");
        }
        if(s1.endsWith("Java")){
            System.out.println("文字列Javaで終わります");
        }
        if(s1.startsWith("Java")){
            System.out.println("文字列Javaで始まります");
        }
        System.out.println("文字列s1で最初にJavaが登場する位置は"+s1.indexOf(s1));
    }
}
