package assign3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class Store implements Serializable {

	protected StoreCommands command;
	protected ArrayList<StoreCommands> commandQueue;
	protected ArrayList<Disc> discLibrary;
	protected int uniqueID;	
	private FileInputStream fileStream;
	private FileOutputStream filePointer;
	private ObjectInputStream objectInputPointer;
	private ObjectOutputStream objectPointer;
	private Object object;
	private Memento memento;
	private CareTaker careTaker;
	public abstract String getName();
	public abstract int getQuantity();
	public abstract void operation();
	public abstract void setQuantity(int quantity);
	public abstract void setPrice(int price);
	public abstract int getField();
	
	public void addToQueue(StoreCommands item){	
		commandQueue.add(item);
		if(commandQueue.size() > 2){
			mementoCall();
			commandQueue.removeAll(commandQueue);
			serialize();
		}
	}
	public Iterator iterator(){
		return new VideoStoreIterator(discLibrary);
	}
	protected int getUniqueNumber(){
		return ++uniqueID;
	}
	public Disc getDisc(String inputName){
		Iterator iterator = iterator();
		Disc disc;
		String discName = "";
		while(iterator.hasNext()){
			disc = (Disc) iterator.next();
			discName = disc.getName();
			if(discName.equals(inputName)){
				return disc;
			}
		}
		return new NullDisc();
	}
	protected int getPrice(){
		return 10;
	}
	private void initialize(String path){
		try{
			 filePointer = new FileOutputStream(path);
			 objectPointer = new ObjectOutputStream(filePointer);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void serialize() {
		System.out.println("inside serialise");
		initialize("F:\\Bharath\\Assignment3\\videoStore.ser");
		try{
			objectPointer.writeObject(commandQueue);
			objectPointer.close();
			System.out.println("done with serialisation");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	private void mementoCall(){
		memento = new Memento();
		memento.add(discLibrary);
		careTaker = new CareTaker();
		careTaker.addMemento(memento);		
	}
	private void inputStreamInitialise(String inputPath){
		try{
			fileStream = new FileInputStream(inputPath);
			objectInputPointer = new ObjectInputStream(fileStream);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	public void executeCommands(){
			ArrayList<Disc> temp;
			memento = new Memento();
			temp = memento.getStore();
			if(temp.size() >0)
				discLibrary	= temp;
		try{
			inputStreamInitialise("F:\\Bharath\\Assignment3\\videoStore.ser");
			Object object = objectInputPointer.readObject();
			ArrayList<StoreCommands> queueCommands = (ArrayList<StoreCommands>) object;
			
			Iterator iterator = queueCommands.iterator();
			while(iterator.hasNext()){
				command = (StoreCommands) iterator.next();
				if(!(command.execute().isNullStore()))
					discLibrary.add(command.execute());	
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}