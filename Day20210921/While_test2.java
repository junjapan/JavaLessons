package Day20210921;

public class While_test2 {
    public static void main(String[] args) {
        /*
        111 - 999 までの乱数を繰り返し生成し777が出るまでの回数をカウントせよ
        */
        int count = 0;
        final int LUCKY = 777;
        while(true){
            count++;
            int rnd = new java.util.Random().nextInt(999 - 111 + 1) + 111;
            System.out.println(count + ":" + rnd);
            if(rnd == LUCKY){
                break;
            }
        }
        System.out.println(count + "回目に" + LUCKY + "がでました！");
    }
}
