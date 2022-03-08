package Day20211022;

public class Student {
    String name;
    Subject[] subAll;
    int sumScore=0;
    int totalScore;

    public Student(String name,Subject[] subAll){
        this.name=name;
        this.subAll=subAll;
        for(int i=0;i<this.subAll.length;i++){
            this.sumScore += subAll[i].score;
        }
        this.totalScore=this.sumScore;
    }
    // public int getTotalScore(){
    //     for(int i=0;i<this.subAll.length;i++){
    //         sumScore += subAll[i].score;
    //     }
    //     return sumScore;
    // }
}
