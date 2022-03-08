package Day20211011;

public class Method1 {
    public static void main(String[] args) {
        System.out.println("start");
        for(int i=0;i<10;i++){
            String name="田中";
            int age=20;
            hello(name,age);
        }
        hello("鈴木",30);
        String name="湊";
        int age=40;
        bye(name,age);
        System.out.println("end");
    }
    //引数
    public static void hello(String name,int age){
        System.out.printf("%s(%d歳)さん、こんにちは%n",name,age);
    }
    public static void bye(String name,int age){
        System.out.printf("%s(%d歳)さん、さようなら%n",name,age);
    }
}
