package assign3;

public class GetDiscPrice extends StoreOperation {
	
	public GetDiscPrice(String inputName, Store inputStore){
		name = inputName;
		store = inputStore;
	}

	public int getField(){
		Disc disc;
		disc = (Disc) store.getDisc(name);
		if(!disc.isNullStore()){
			return disc.getPrice();
		}
		return 0;
	}
}
