package Day20210917;

public class Ex3_3 {
    public static void main(String[] args){
        boolean isHungry = false;
        String food = "カレー";
        System.out.println("こんにちは");

        if (isHungry == false){
            System.out.println("お腹がいっぱいです");
        }else{
            System.out.println("はらぺこです");
        }
        if(isHungry){
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");

    }
}
