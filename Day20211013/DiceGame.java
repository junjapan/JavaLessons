package Day20211013;
import java.util.*;
public class DiceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("何人>>");
        int personNum=scan.nextInt();
        char[] players=createAlphArr('A', personNum);
        int[] sums=new int[players.length];
        System.out.print("何回ふる>>");
        int count=scan.nextInt();
        for(int i=0;i<players.length;i++){
            int[] diceArr=createDiceArr(count);
            sums[i]=arrSum(diceArr);
            System.out.printf("%sさん：%s 合計：%d%n",players[i],Arrays.toString(diceArr),sums[i]);
        }
        //判定
        if(isSame(sums)){
            System.out.println("引き分け");
        }else{
            int maxNum=maxNum(sums);
            String str="";
            for(int i=0;i<sums.length;i++){
                if(sums[i]==maxNum){
                    str+=players[i]+"さん,";
                }
            }
            //最後の一文字を削除する処理
            str=str.substring(0,str.length()-1);
            //結果出力
            System.out.println(str+"の勝ち");
            
        }
        scan.close();
    }
    public static int[] createDiceArr(int count){
        int[] diceArr=new int[count];
        Random rnd= new Random();
        for(int i=0;i<count;i++){
            diceArr[i]=rnd.nextInt(6)+1;
        }
        return diceArr;
    }
    public static int arrSum(int[] nums){
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        return sum;
    }
    public static char[] createAlphArr(char first,int num){
        char[] alphArr=new char[num];
        for(int i=0;i<alphArr.length;i++){
            alphArr[i]=(char)(first+i);
            System.out.println(first+i);
        }
        return alphArr;
    }
    public static boolean isSame(int[] nums){
        int first=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != first){
                return false;
            }
        }
        return true;
    }
    public static int maxNum(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > max){
                max=nums[i];
            }
        }
        return max;
    }
}
