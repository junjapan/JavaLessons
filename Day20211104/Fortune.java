import java.util.*;
public class Fortune{
	public static void main(String[] args){
		String name=args.length==0?"あなた":args[0]+"さん";
		Calendar today=Calendar.getInstance();
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH);
		int day=today.get(Calendar.DATE);
		int seed=calcSeed(name,year,month,day);
		String fortune=getFortune(seed);
		System.out.printf("%sの%d/%d/%d の運勢は%sです%n",name,year,month+1,day,fortune);
	}
	static int calcSeed(String name,int year,int month,int day){
		int seed=year+month+day;
		for(int i=0;i<name.length();i++){
			seed += name.charAt(i);
		}
		return seed;
	}
	static String getFortune(int seed){
		String fortune=null;
		Random rand=new Random(seed);
		int n=rand.nextInt(100);
		Map<String,Integer> data=new LinkedHashMap<>(){
			{
				put("大吉",60);
				put("中吉",30);
				put("吉",7);
				put("凶",3);
			}
		};
		for(String key:data.keySet()){
			if(n-data.get(key) < 0){
				fortune=key;
				break;
			}
			n-=data.get(key);
		}
		return fortune;
	}
}
