package assign3;

public class GetDiscQuantity extends StoreOperation {
	
	public GetDiscQuantity(String inputName, Store inputStore){
		name = inputName;
		store = inputStore;
	}

	public int getField(){
		Disc disc;
		disc = (Disc) store.getDisc(name);
		if(!disc.isNullStore()){
			return disc.getQuantity();
		}
		return 0;
	}
}
