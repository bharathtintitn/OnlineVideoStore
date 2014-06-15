package assign3;

public abstract class Disc {
	
	protected String name;
	protected int price;
	protected int uniqueID;
	protected int quantity;
	
	public abstract boolean isNullStore();
	public abstract String getName();
	public abstract String getDvdName();
	public abstract void setQuantity(int numberOfChange);
	
	public abstract void setPrice(int newPrice);
	public abstract int getQuantity();
	public abstract int getPrice();
	

}
