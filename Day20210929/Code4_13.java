package Day20210929;

public class Code4_13 {
    public static void main(String[] args) {
        int[] scores = {20,30,40,50,60};
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
        }
        System.out.println("-----------");
        //配列の走査の場合は拡張for文が便利
        for(int n : scores){
            System.out.println(n);
        }
        System.out.println("-----------");
        String[] beatles={"John","Paul","George","Ringo"};
        for(String name : beatles){
            System.out.println(name);
        }
        System.out.println("-----------");
        double[] weights = {67.2,66.8,66.6,66.5,66.4,};
        for(double w : weights){
            System.out.println(w);
        }
    }
}
