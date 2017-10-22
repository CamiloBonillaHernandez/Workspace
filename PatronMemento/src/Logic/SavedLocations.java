package Logic;

import java.util.ArrayList;

public class SavedLocations {
	
	private ArrayList<Memento> locations; 
	
	public SavedLocations(){
		locations = new ArrayList();
	}
	
	public void addMemento(Memento m){
		locations.add(m);
	}
	
	public ArrayList<Memento> getLocations(){
		return locations;
	}
}
