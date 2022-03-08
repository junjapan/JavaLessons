package Home20211101;

public class Cat {
	public static final char[] TYPES={'A','B','C'};
	private char type;
	private String name;
	private int intimacy;
	public Cat(char type,String name){
		this.type=type;
		this.name=name;
	}
	
	public void play(){
		System.out.println("Playing with "+this.name+".");
		System.out.println("...");
		intimacy++;
		System.out.println("Intimacy is up!!");
	}
	public String info(){
		return String.format("%s[%c](%d)", this.name,this.type,this.intimacy);
	}
	public String getName(){
		return this.name;
	}
	public char getType(){
		return this.type;
	}
	public int getIntimacy(){
		return this.intimacy;
	}
}
