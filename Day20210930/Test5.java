package Day20210930;

public class Test5 {
    public static void main(String[] args) {
        /*
        海1
        地面0
        岩2
        */
        //２次元配列
        int[][] data = {
            {1,0,0,0,2,0,0,0},
            {1,1,0,0,0,0,0,0},
            {1,1,0,0,0,2,0,0},
            {1,1,0,0,0,0,0,0},
        	{1,1,1,0,0,0,0,3},
            {1,1,0,0,0,0,3,3},
            {1,0,0,0,0,0,0,0},
        };
        String[] maps={"地","海","岩","木",};
        //取得
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                System.out.printf("%s",maps[data[i][j]]);
            }
            System.out.println();
        }
    }
}
