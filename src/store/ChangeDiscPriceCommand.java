package assign3;

public class ChangeDiscPriceCommand extends StoreCommands {

	public ChangeDiscPriceCommand(Disc inputDisc, int newPrice){
		disc = inputDisc;
		quantity = newPrice;
	}
	@Override
	public Disc execute() {
		disc.setPrice(quantity);
		return new NullDisc();
	}
}
