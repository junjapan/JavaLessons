package Day20211013;

public class Method1 {
    public static void main(String[] args) {
        int a=3,b=5;
        int n = sumOf(a,b);
        System.out.println(n);
        n=sumOf(4,5,6);
        System.out.println(n);
        String str = timesWord("Love",3);
        System.out.println(str);
        String str1 = decoWord("aaa", '★');
        System.out.println(str1);
        
    }
    /*
    名前が同じで引数の並びが違うメソッドを宣言することを
    Overload（オーバーロード、多重定義）という
    */
    public static int sumOf(int a,int b){
        return a+b;
    }
    public static int sumOf(int x,int y,int z){
        return x+y+z;
    }
    public static int sumOf(int[] arr){
        int sum=0;
        for(int n:arr){
            sum += n;
        }
        return sum;
    }
    public static String timesWord(String str,int n){
        String timesW="";
        for(int i=0;i<n;i++){
            timesW = timesW + str;
        }
        return timesW;
    }
    public static String decoWord(String word,char deco){
        return deco + word + deco;
    }
    public static String decoWord(String word,String first,String last){
        return first + word + last;
    }
}
