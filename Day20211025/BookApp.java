package Day20211025;
import java.util.*;
public class BookApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("本のページ数を入力して下さい >");
        int pageCount1 = scan.nextInt();
        System.out.print("本の価格を入力して下さい >");
        int value1 = scan.nextInt();
        System.out.print("ノートのページ数を入力して下さい >");
        int pageCount2 = scan.nextInt();
        System.out.print("ノートの価格を入力して下さい >");
        int value2 = scan.nextInt();
        Book bk = new Book(pageCount1, value1);
        NoteBook nbk = new NoteBook(pageCount2, value2);
        while(true){
            System.out.printf("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
            int n = scan.nextInt();
            switch(n){
                case 1:
                    bk.info();
                    break;
                case 2:
                    nbk.info();
                    break;
                case 3:
                    System.out.printf("書き込む内容を入力して下さい >");
                    String memo = scan.next();
                    nbk.addMemo(memo);
                    break;
                case 4:
                    System.out.println("アプリケーションを終了します。");
                    scan.close();
                    return;
            }
        }
    }
}
