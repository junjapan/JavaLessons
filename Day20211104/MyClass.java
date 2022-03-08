import java.util.LinkedHashMap;
public class MyClass extends LinkedHashMap<String,Integer>{
	String name;
	{
		put("A",10);
		put("B",20);
		put("C",30);
	}
	MyClass(String name){
		this.name=name;
	}
}
