package assign3;

public class SetDiscQuantityCommand extends StoreCommands {

	
	public SetDiscQuantityCommand(Disc inputDisc, int newQuantity){
		disc = inputDisc;
		quantity = newQuantity;
	}
	@Override
	public Disc execute() {
		int presentQuantity = disc.getQuantity();
		if((presentQuantity + quantity) >= 0){
			disc.setQuantity(presentQuantity + quantity);
		}
		return new NullDisc();
	}
}
