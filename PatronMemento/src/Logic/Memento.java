package Logic;

public class Memento {
	
	private String location;
	
	public Memento(String l){
		this.location = l;
	}
	
	public String getSavedLocation(){
		return this.location;
	}
}
