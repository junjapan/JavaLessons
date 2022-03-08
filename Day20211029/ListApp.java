package Day20211029;
import java.util.*;
public class ListApp {
    public static void main(String[] args) {
        String[] names=new String[3];
        names[0]="たなか";
        names[1]="すずき";
        names[2]="さいとう";

        System.out.println(names[1]);

        ArrayList<String> names2=new ArrayList<>();
        names2.add("John");
        names2.add("Paul");
        names2.add("Ringo");
        System.out.println(names2.get(1));
        names2.remove("Paul");
        System.out.println(names2);


        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println(list1.get(0));//10

        for(int i:list1){
            System.out.println(i);
        }

        list1.add(0,5);
        System.out.println(list1);

        list1.set(0, 8);
        System.out.println(list1);

        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        if(!list1.isEmpty()){
            System.out.println("空ではない");
        }else{
            System.out.println("空です");
        }
        if(list1.contains(10)){
            System.out.println("10を含む");
        }
        System.out.println(list1.indexOf(10));//1

        list1.remove(0);
        System.out.println(list1);
        list1.add(2);
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        // list1.clear();
        System.out.println(list1);

        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
        List<String> list2=new ArrayList<>();
        list2.add("hello");
    }
    public static void hoge(List<Integer> list){
        for(int i:list){
            System.out.println(i);
        }
    }
}
