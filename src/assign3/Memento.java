package assign3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Memento implements Serializable{

	private ArrayList<Disc> discList;
	private CareTaker careTaker;
	
	public void add(ArrayList<Disc> inputDiscList){
		discList = inputDiscList;
	}
	public ArrayList<Disc> getStore(){
		Memento memento;
		careTaker = new CareTaker();
		memento = careTaker.getMemento();
		return memento.discList;
	}
}
