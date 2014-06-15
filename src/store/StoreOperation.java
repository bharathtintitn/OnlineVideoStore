package assign3;

public abstract class StoreOperation extends Store {
	protected int quantity;
	protected String name;
	protected Store store;
	protected StoreCommands command;
	protected int price;
	
	public void run(){
		Disc disc;
		disc = command.execute();
		store.discLibrary.add(disc);
		store.addToQueue(command);
		store.serialize();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public int operation1(){
		return 0;
	}
	@Override
	public int getField() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
	}
	
	
	@Override
	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		
	}
	
}
