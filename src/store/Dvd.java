package assign3;

import java.io.Serializable;

public class Dvd extends Disc implements Serializable{

	public Dvd(String dvdName, int dvdQuantity, int inputUniqueNumber, int inputPrice){
		name = dvdName;
		uniqueID = inputUniqueNumber;
		quantity = dvdQuantity;
		price = inputPrice;
	}
	public boolean isNullStore(){
		return false;
	}
	public String getName(){
		return name;
	}
	public String getDvdName(){
		return name;
	}
	public void setQuantity(int numberOfChange){
		quantity = numberOfChange;
	}
	
	public void setPrice(int newPrice){
		price = newPrice;
	}
	public int getQuantity(){
		return quantity;
	}
	public String toString(){
		String returnName;
		returnName= name+" "+quantity +" "+price+" "+uniqueID;
		return returnName;
	}
	@Override
	public int getPrice() {
		return price;
	}
}
