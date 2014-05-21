package assign3;

import java.util.ArrayList;
import java.util.Iterator;

public class VideoStoreIterator implements Iterator {
	
	private int index;
	private int size;
	private ArrayList<Disc> dvdCollection;
	public VideoStoreIterator(ArrayList<Disc> dvd){
		index = 0;
		size = dvd.size();
		dvdCollection = dvd;		
	}
	@Override
	public boolean hasNext() {
		if(index < size)
			return true;
		else
			return false;
	}

	@Override
	public Disc next() {
		String returnName;
		return dvdCollection.get(index++);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}
}
