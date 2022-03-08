package Day20211025;

public class Book {
    int pageCount;
    int value;
    public Book(int pageCount, int value){
        this.pageCount=pageCount;
        this.value=value;
    }
    public void info(){
        System.out.printf("ページ数：%d%n",this.pageCount);
        System.out.printf("価格：%d%n",this.value);
    }
}
