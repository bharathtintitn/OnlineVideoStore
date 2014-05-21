package assign3;

public  class ChangeDiscPrice extends StoreOperation {
	
	
	public ChangeDiscPrice(String inputName,int inputPrice, Store inputStore){
		name = inputName;
		quantity = inputPrice;
		store = inputStore;
	}
	
	public void operation(){
		Disc disc;
		disc = (Disc) store.getDisc(name);
		if(!disc.isNullStore()){
			command = new ChangeDiscPriceCommand(disc,quantity);	
			disc = (Disc) command.execute();
			store.addToQueue(command);
			store.serialize();
		}
	}


}
