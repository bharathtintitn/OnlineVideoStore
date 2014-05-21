package assign3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CareTaker implements Serializable{
	Memento savedStore;

	private FileInputStream fileStream;
	private FileOutputStream filePointer;
	private ObjectInputStream objectInputPointer;
	private ObjectOutputStream objectPointer;
	
	public void addMemento(Memento memento){
		savedStore = memento;
		try{

			filePointer = new FileOutputStream("F:\\Bharath\\Assignment3\\memento.ser");
			objectPointer = new ObjectOutputStream(filePointer);
			objectPointer.writeObject(savedStore);
			objectPointer.close();
	
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Memento getMemento(){
		
		try{
			fileStream = new FileInputStream("F:\\Bharath\\Assignment3\\videoStore.ser");
			objectInputPointer = new ObjectInputStream(fileStream);
			Object object = objectInputPointer.readObject();
			savedStore = (Memento) object;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return savedStore;
	}

}
