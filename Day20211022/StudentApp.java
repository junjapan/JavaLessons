package Day20211022;
import java.util.*;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("科目数は>>");
        int subNum = scan.nextInt();
        String[] subArr = new String[subNum];
        for(int i=0;i<subNum;i++){
            System.out.printf("科目%d>>",i+1);
            subArr[i]= scan.next();
        }
        // System.out.println(Arrays.toString(sub));
        System.out.print("生徒は何人ですか>>");
        int stuNum = scan.nextInt();
        Student[] student = new Student[stuNum];
        for(int i=0;i<stuNum;i++){
            System.out.printf("%d人目の名前を入力>>",i+1);
            String name = scan.next();
            Subject[] subAll = new Subject[subArr.length];
            for(int j=0;j<subArr.length;j++){
                System.out.printf("%sの%s>>",name,subArr[j]);
                int score = scan.nextInt();
                subAll[j] = new Subject(subArr[j], score);
            }
            student[i] = new Student(name, subAll);
        }
        System.out.println("---結果---");
        for(int i=0;i<student.length-1;i++){
            for(int j=i+1;j<student.length;j++){
                if(student[i].totalScore < student[j].totalScore){
                    Student tmp = student[i];
                    student[i]=student[j];
                    student[j]=tmp;
                }
            }
        }

        for(int i=0;i<student.length;i++){
            System.out.printf("%d.%s(%d)%n",i+1,student[i].name,student[i].totalScore);
            Subject[] subDis = student[i].subAll;
            for(int j=0;j<student[i].subAll.length;j++){
                subDis[j].display();
            }
        }
        scan.close();
    }
}
