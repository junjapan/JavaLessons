package Day20211029;
import java.util.*;
public class SetApp {
    public static void main(String[] args) {
        Set<String> colors=new HashSet<>();
        colors.add("赤");
        colors.add("青");
        colors.add("黄");
        colors.add("赤");
        System.out.println("色は"+colors.size()+"種類");
        for(String s:colors){
            System.out.println(s);
        }

        // Set<String> words=new TreeSet<>();
        Set<String> words=new LinkedHashSet<>();
        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("panda");
        for(String s:words){
            System.out.println(s);
        }


    }
}
