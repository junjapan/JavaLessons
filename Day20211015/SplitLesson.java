package Day20211015;
import java.util.*;
public class SplitLesson {
    public static void main(String[] args) {
        /*
        csv(comma separated values)
        */
        String str="りんご,みかん,ばなな";
        String[] data=str.split(",");
        System.out.println(Arrays.toString(data));
        String str1="りんご,みかん,,ばなな";
        String[] data1=str1.split(",");
        System.out.println(Arrays.toString(data1));
        String str2="りんご,みかん,,ばなな,,,";
        String[] data2=str2.split(",",-1);
        System.out.println(Arrays.toString(data2));
        String str3="りんご,みかん,ばなな,なし";
        String[] data3=str3.split(",",2);
        System.out.println(Arrays.toString(data3));
        //配列から文字列
        String[] fruits={"みかん","りんご","ばなな"};
        String fStr=String.join(",",fruits);
        System.out.println(fStr);//みかん、りんご、ばなな
        //3 5
        
        Scanner sc = new Scanner(System.in);
        /*
        String input = sc.nextLine();
        String[] nums=input.split(" ");
        int a=Integer.parseInt(nums[0]);
        int b=Integer.parseInt(nums[1]);
        System.out.println("a:"+a+"b:"+b);
        */
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a:"+a+"b:"+b);
        sc.close();
    }
}
