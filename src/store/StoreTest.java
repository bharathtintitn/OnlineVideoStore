package assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class StoreTest {
	@Test
	public void test() {
		
		int value = 0;
		Store two = new VideoStore();
		two.executeCommands();

		Store three = new AddDisc("simple",1, two);
		three.operation();

		assertEquals("simple 1 10 1",two.getDisc("simple").toString());
		three = new AddDisc("lovestory",1,two);
		three.operation();

		assertEquals("lovestory 1 10 2",two.getDisc("lovestory").toString());

		three = new SetDiscQuantity("lovestory",2,two);
		three.operation();
		assertEquals("lovestory 3 10 2",two.getDisc("lovestory").toString());
		
		three = new SellDisc("lovestory",1,two);	
		three.operation();
		assertEquals("lovestory 2 10 2",two.getDisc("lovestory").toString());
		
		three = new GetDiscPrice("lovestory",two);
		value = three.getField();
		assertEquals(10,value);
		
		three = new GetDiscQuantity("lovestory",two);
		value = three.getField();
		assertEquals(2,value);

		three = new AddDisc("Inception",1,two);
		three.operation();

		assertEquals("Inception 1 10 3",two.getDisc("Inception").toString());

		three = new SetDiscQuantity("Inception",2,two);
		three.operation();
		assertEquals("Inception 3 10 3",two.getDisc("Inception").toString());
		
		three = new SellDisc("Inception",1,two);	
		three.operation();
		assertEquals("Inception 2 10 3",two.getDisc("Inception").toString());
		
		three = new GetDiscPrice("Inception",two);
		value = three.getField();
		assertEquals(10,value);
		
		three = new GetDiscQuantity("Inception",two);
		value = three.getField();
		assertEquals(2,value);
	}

}
