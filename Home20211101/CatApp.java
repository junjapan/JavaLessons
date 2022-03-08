package Home20211101;

import java.util.*;
public class CatApp {
	private static ArrayList<Cat> list=new ArrayList<>();
	private static final int NAME_ASC=0,TYPE_ASC=1,INTIMACY_DESC=2;
	private static int mode=NAME_ASC;
	// private static int mode=TYPE_ASC;
	// private static int mode=INTIMACY_DESC;
	public static void main(String[] args) {
		System.out.println("***Cat Collection***");
		Random r=new Random();
		Scanner s=new Scanner(System.in);		
		while(true){
			System.out.print("1.Collect 2.Play 3.End＞");
			int select=s.nextInt();
			switch(select){
			case 1:
				int index=r.nextInt(Cat.TYPES.length);
				char type=Cat.TYPES[index];
				System.out.println(type+"-type cat appeared!");
				System.out.print("Please name this cat>");
				String name=s.next();
				Cat c=new Cat(type,name);
				list.add(c);
				System.out.println(name+" joined!");
				break;
			case 2:
				if(list.size()==0){
					System.out.println("You do not have anyone to play with.");
				}else{
					sortList(mode);
					for(int i=0;i<list.size();i++){
						System.out.printf("%d・・・%s%n",i,list.get(i).info());
					}
					System.out.print("Who do you play with?>");
					int num=s.nextInt();
					list.get(num).play();
				}			
				break;
			case 3:
				System.out.println("Game over");
				s.close();
				return;
			}
		}

	}
	private static void sortList(int sortMode){
		for(int i=0;i<list.size()-1;i++){
			for(int j=i+1;j<list.size();j++){
                // private static final int NAME_ASC=0,TYPE_ASC=1,INTIMACY_DESC=2;
                // private static int mode=INTIMACY_DESC;
                // sortList(mode);
                //
                //2==0 && (1,-1,0) > 0 ||
                //2==1 && (A,B,C) > (A,B,C) ||
                //2==2 && (intimacy) < (intimacy)
                //
                if(
					sortMode== NAME_ASC && list.get(i).getName().compareTo(list.get(j).getName()) >0 ||
					sortMode == TYPE_ASC && list.get(i).getType() > list.get(j).getType() || 
					sortMode == INTIMACY_DESC && list.get(i).getIntimacy() < list.get(j).getIntimacy() 
					){
					Cat cat=list.get(i);
					list.set(i, list.get(j));
					list.set(j, cat);
				}
			}
		}
	}	 
}