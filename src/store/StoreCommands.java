package assign3;

import java.io.Serializable;

public abstract class StoreCommands implements Serializable{

	protected Disc disc;
	protected int quantity;
	
	public abstract Disc execute();
	
}
