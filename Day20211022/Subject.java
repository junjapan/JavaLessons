package Day20211022;

public class Subject {
    String subName;
    int score;

    public Subject(String subName,int score){
        this.subName=subName;
        this.score=score;
    }
    public void display(){
        System.out.printf("%s:",this.subName);
        for(int i=0;i<this.score;i++){
            System.out.print("*");
            if((i+1)%10==0){
                System.out.print("|");
            }
        }
        System.out.println();
    }
}
