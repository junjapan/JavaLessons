package Day20211025;

public class NoteBook extends Book{
    String memo;
    public NoteBook(int pageCount, int value){
        super(pageCount, value);
    }
    public void addMemo(String memo){
        this.memo += memo;
    }
    public void info(){
        super.info();
        System.out.println("");
    }
}
