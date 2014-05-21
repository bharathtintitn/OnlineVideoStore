package assign3;

public class SellDisc extends StoreOperation {

	
	public SellDisc(String inputName,int inputQuantity, Store inputStore){
		name = inputName;
		quantity = inputQuantity * (-1);
		store = inputStore;
	}
	
	public void operation(){
		Disc disc;
		disc = (Disc) store.getDisc(name);
		if(!disc.isNullStore()){
			command = new SetDiscQuantityCommand(disc,quantity);	
			disc = (Disc) command.execute();
			store.addToQueue(command);
			store.serialize();
		}
	}

}
