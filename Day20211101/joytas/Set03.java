package Day20211101.joytas;

import java.util.*;

public class Set03 {
    public static void main(String[] args) {
        String dataCSV="タコ,イクラ,マグロ,トロ,イクラ,ウニ,ホタテ,マグロ,トロ,マグロ,エビ,イカ";
        System.out.println("今日食べたお寿司");
        String[] data = dataCSV.split(",");
        for(String sushi:data){
            System.out.println(sushi);
        }
        String data1 = String.join(",",data);
        System.out.println(data1);
        System.out.println("食べた種類を食べた順に表示します(重複除く)");
        List<String> list = Arrays.asList(data);
        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
