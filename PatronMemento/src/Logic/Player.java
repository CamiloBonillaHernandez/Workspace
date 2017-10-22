package Logic;

public class Player {
	
	private String name;
	private String location;
	
	public Player(String name,String location){
		this.name = name;
		this.location = location;
	}
	
	
	public Memento saveToMemento(){
		System.out.println("Current Location: "+ location);
		return new Memento(location);
	}
	
	public void  restoreToMemento(Memento m){
		location = m.getSavedLocation();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
	
}
