package Day20211014;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        /*
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("数値1>>");
        int num1 = scan.nextInt();
        System.out.print("数値2>>");
        int num2 = scan.nextInt();
        System.out.printf("%dから%dまでの和は%dです%n",
        Math.min(num1, num2),
        Math.max(num1, num2),
        sumOfRange(num1,num2));
        scan.close();
    }
    public static int sumOfRange(int num1,int num2){
        int sum=0;
        int sta = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        for(int i=sta;i<=end;i++){
            sum = sum + i;
        }
        return sum;
    }
}
