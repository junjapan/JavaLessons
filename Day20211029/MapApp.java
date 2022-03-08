package Day20211029;
import java.util.*;
public class MapApp {
    public static void main(String[] args) {
        Map<String,Integer> prefs= new HashMap<>();
        prefs.put("京都府",255);
        prefs.put("東京都",1261);
        prefs.put("熊本",181);
        int tokyo = prefs.get("東京都");
        System.out.println(tokyo);
        prefs.remove("京都府");
        prefs.put("熊本県",182);
        int kumamoto=prefs.get("熊本県");
        System.out.println(kumamoto);
        for(String key:prefs.keySet()){
            int value=prefs.get(key);
            System.out.println(key+"の人口は"+value);
        }
        System.out.println(prefs.size());
        if(prefs.containsKey("熊本")){
            System.out.println("熊本は含まれます");
        }
        if(prefs.containsValue(182)){
            System.out.println("182は、valueに含まれます");
        }
        System.out.println(prefs);
        Map<String,List<String>> data=new HashMap<>();
        List<String> tokyo1=new ArrayList<>();
        tokyo1.add("切子");
        tokyo1.add("佃煮");
        tokyo1.add("寿司");
        tokyo1.add("のり");
        data.put("東京",tokyo1);
        List<String> kyoto=new ArrayList<>();
        kyoto.add("織物");
        kyoto.add("人形");
        kyoto.add("漬物");
        kyoto.add("陶器");
        data.put("京都",kyoto);
        List<String> kanagawa = Arrays.asList("a","b","c");
        String[] arr={"f","g","h"};
        List<String> saitama=Arrays.asList(arr);
        data.put("埼玉",saitama);
        System.out.println(data);
        System.out.println(kanagawa);
    }
}
