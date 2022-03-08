package Day20211029.array;
import java.util.*;
public class CatApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("***Cat Collection***");
        ArrayList<Cat> cats=new ArrayList<>();
        //ループ
        while(true){
            System.out.print("1.Collect 2.Play 3.End＞");
            int num=scan.nextInt();
            switch(num){
                case 1:
                    Cat cat=new Cat();
                    cat.appear();
                    System.out.print("Please name this cat>");
                    String name=scan.next();
                    cat.name=name;
                    cats.add(cat);
                    break;
                case 2:
                    if(cats.size()==0){
                        System.out.println("You do not have anyone to play with.");
                    }else{
                        for(int i=0;i<cats.size();i++){
                            System.out.printf("%d・・・%s%n",i,cats.get(i));
                        }
                        System.out.print("Who do you play with?>");
                        int numPlay = scan.nextInt();
                        cats.get(numPlay).play();
                    }
                    break;
                case 3:
                    System.out.println("Game over");
                    scan.close();
                    return;
            }
        }
    }
}
