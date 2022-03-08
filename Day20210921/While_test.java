package Day20210921;

public class While_test {
    public static void main(String[] args) {
        /*
        388400km 388400 * 1000 * 1000
        １枚の紙があります。1mm
        １回折り曲げると2mm
        また折り曲げると4mm
        */
        long dist = 384400L * 1000 * 1000;
        long paper = 1L;
        int count = 0;

        while( paper < dist){
            count++;
            // paper = paper * 2;
            paper *=2;
            System.out.println(count + "回折り曲げた" + paper + "mm");
        }
        System.out.println(count + "回で超えました");
    }
}
