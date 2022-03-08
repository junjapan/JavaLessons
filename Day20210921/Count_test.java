package Day20210921;

public class Count_test {
    public static void main(String[] args) {
        /*
        1-20までカウントアップ
        ただし３で割り切れるはFizz
        ５の割り切れるはBuzz
        ３でも５でもの場合FizzBuzz
        */
        for(int i=1;i<=20;i++){
            if((i%3 == 0) && (i%5 == 0)){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
