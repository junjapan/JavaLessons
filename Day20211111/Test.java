package Day20211111;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            e.getMessage();
        }
    }
}
