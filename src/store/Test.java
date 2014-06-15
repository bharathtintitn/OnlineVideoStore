package assign3;

import java.util.Iterator;

public class Test {

	public static void main(String args[]){
		Store two = new VideoStore();
//		two.executeCommands();
		System.out.println("done");
		Store three = new AddDisc("simple",1, two);
		three.operation();
		System.out.println("created dvd "+two.getDisc("simple").toString());
		three = new AddDisc("lovestory",1,two);
		three.operation();
		
		//System.out.println(two.dvdCollection.get(0).toString());
		
		Iterator iterator =  two.iterator();
		while(iterator.hasNext()){
			System.out.println("################################");
			System.out.println(iterator.next().toString());
			System.out.println("################################");
		}
		
		three = new SetDiscQuantity("lovestory",2,two);
		three.operation();
		
		 iterator =  two.iterator();
		while(iterator.hasNext()){
			System.out.println("################################");
			System.out.println(iterator.next().toString());
			System.out.println("################################");
		}
		
		System.out.println("selling dvd now");
		three = new SellDisc("lovestory",1,two);	
		three.operation();
		System.out.println(two.discLibrary.get(1).toString());
		
		System.out.println("getting price details");
		three = new GetDiscPrice("lovestory",two);
		System.out.println(three.getField());
		
		System.out.println("getting disc quantity");
		three = new GetDiscQuantity("lovestory",two);
		System.out.println(three.getField());
		
	}
}
