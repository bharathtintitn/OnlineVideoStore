package assign3;

public class SetDiscQuantity extends StoreOperation {

	
	public SetDiscQuantity(String inputName,int inputQuantity, Store inputStore){
		name = inputName;
		quantity = inputQuantity;
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
