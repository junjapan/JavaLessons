package Day20211018;

public class argsLesson {
    public static void main(String[] args) {
        if(args.length==0){
          return;
        }
        String[] data=args[0].split(",");
        int max=Integer.parseInt(data[0]);
        for(int i=1;i<data.length;i++){
          if(Integer.parseInt(data[i]) > max){
            max=Integer.parseInt(data[i]);
          }
        }
        System.out.printf("最大値:%d%n",max);
      }
}
