package assign3;

public class NullDisc extends Disc {

	
	public boolean isNullStore(){
		return true;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub

	}
	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public String getDvdName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
