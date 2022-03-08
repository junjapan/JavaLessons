import java.util.Calendar;

public class SuperClass {
    static {
    	System.out.println("Super static init");
    }
    {
    	System.out.println("Super init");
    }
    SuperClass(){
    	System.out.println("Super constructor");
    }
}
class SubClass extends SuperClass{
	static int totalCount;
	int year;
	int month;
	int day;
    static {
    	System.out.println("Sub static init");
    	totalCount = 0;
    }
    {
    	Calendar today = Calendar.getInstance();
    	this.year=today.get(Calendar.YEAR);
    	this.month=today.get(Calendar.MONTH)+1;
    	this.year=today.get(Calendar.DATE);
    	System.out.println("Sub init");
    }
    SubClass(){
    	System.out.println("Sub constructor");
    }
    void showInfo() {
    	System.out.printf("今日は%s年%s月%s日です%n",this.year,this.month,this.year);
    }

}