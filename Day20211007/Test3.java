package Day20211007;

public class Test3 {
    public static void main(String[] args) {
        int[][] table ={
          {1,0,0,0,2,0,0,0},
          {1,1,0,0,0,0,0,0},
          {1,1,0,0,0,2,0,0},
          {1,1,0,0,0,0,0,0},
          {1,1,1,0,0,0,0,3},
          {1,1,0,0,0,0,3,3},
          {1,0,0,0,0,0,0,0},
        };
        String[] maps={"地","海","岩","木"};
    
        for(int i=0;i<table.length;i++){
          for(int j=0;j<table[i].length;j++){
            int num = table[i][j];
            System.out.print(maps[num]);
          }
          System.out.println();
        }
      }
}
