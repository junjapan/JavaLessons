package Day20210917;

public class Iflesson {
    public static void main(String[] args){

        int age = 19;

        if(age >= 20){
            System.out.println("大人です");
        }else{
            System.out.println("子どもです");
        }

        int score = 82;

        if(score >= 80){
            System.out.println("優");
        }else if(score >= 60){
            System.out.println("良");
        }else if(score >= 40){
            System.out.println("可");
        }else{
            System.out.println("不可");
        }
        System.out.println("end");

        String gender = "男";
        age = 33;

        if((gender.equals("男") && age >= 18)
        || (gender.equals("女") && age >= 16)){
            System.out.println("結婚OK");
        }

        /* うるう年
            ４で割り切れたら基本はうるう年
            ただし、１００で割り切れたら×
            ただし、４００で割り切れたらＯＫ
        */

        System.out.println("うるう年判定start");
        int year = 1232;
        if( (year % 4 == 0 && year % 100 != 0)
        ||  (year % 400 == 0) ){
            System.out.println("うるう年です");
        }else{
            System.out.println("うるう年じゃないです");
        }
        System.out.println("うるう年判定end");
        
    }
}
