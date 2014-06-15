package assign3;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class VideoStore extends Store implements Serializable {
	
	public VideoStore(){
		uniqueID = 0;
		discLibrary = new ArrayList<Disc>();
		commandQueue = new ArrayList<StoreCommands>();
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
	public void setPrice(int price) {
		// TODO Auto-generated method stub
	}
	@Override
	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub		
	}
	@Override
	public int getField() {
		// TODO Auto-generated method stub
		return 0;
	}
}
