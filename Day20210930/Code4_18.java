package Day20210930;

public class Code4_18 {
    public static void main(String[] args) {
        int[][] scores = new int[2][3];
        scores[0][0] = 40;
        scores[0][1] = 50;
        scores[0][2] = 60;
        scores[1][0] = 80;
        scores[1][1] = 60;
        scores[1][2] = 70;
        System.out.println(scores[1][1]);

        int[][] scores2={{40,50,60,},{80,60,70,}};
        System.out.println(scores2.length);//2
        System.out.println(scores2[0].length);;//3

        int[][] arr = new int[2][];
        arr[0] = new int[]{40,50,60,};
        arr[1] = new int[]{80,60,70,60,};
        System.err.println(arr[0][1]);
    }
}
