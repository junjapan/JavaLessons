
public class TestApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        SubClass sc=new SubClass();
        SubClass sc2=new SubClass();
        sc.showInfo();
        sc2.showInfo();
        MyClass mc=new MyClass("John");
        System.out.println(mc.name);
        System.out.println(mc.get("A"));
        mc.put("D", 100);
        for(String key:mc.keySet()) {
        	System.out.printf("%s:%d%n",key,mc.get(key));
        }
	}

}
