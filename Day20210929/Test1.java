package Day20210929;

public class Test1 {
    public static void main(String[] args) {
        String name = "山田";
        int age = 20;
        System.out.printf("%s(%d)さんこんにちは%n",name,age);

        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.printf("%3d",i*j);
            }
            System.out.println();
        }
        double pi=3.141592;
        System.out.printf("円周率は%.2fです%n",pi);

        // pi = (int)(pi*100)/100d;
        pi = (int)(pi*100)/100.0;
        System.out.println(pi);
    }
}
