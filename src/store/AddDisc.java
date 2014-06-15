package assign3;

import java.util.ArrayList;

public class AddDisc extends StoreOperation {

	public AddDisc(String inputName,int inputQuantity, Store inputStore){
		name = inputName;
		quantity = inputQuantity;
		store = inputStore;
	}
	
	public void operation(){
		command = new AddDiscCommand(name,quantity,store.getUniqueNumber(),store.getPrice());
		run();
	}
}
