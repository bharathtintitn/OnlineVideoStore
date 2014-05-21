package assign3;

public class AddDiscCommand extends StoreCommands {

	private String name;
	private int uniqueID;
	private int price;
	
	public AddDiscCommand(String inputName, int inputQuantity, int inputUniqueID, int inputPrice){
		name = inputName;
		quantity = inputQuantity;
		uniqueID = inputUniqueID;
		price = inputPrice;
	}
	@Override
	public Disc execute() {
		return new Dvd(name,quantity,uniqueID,price);
	}

}
