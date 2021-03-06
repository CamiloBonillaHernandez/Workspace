package Logic;

import java.util.ArrayList;

public class NotifyNewProduct implements Action{
	
	private static ArrayList<NewProduct> observers = new ArrayList<NewProduct>();
	
	public void attach(NewProduct observer) {
		observers.add(observer);
	}

	public void dettach(NewProduct observer) {
		observers.remove(observer);		
	}

	public void notifyObserversNewProduct() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).newP();
		}
	}

	public void notifyObserversNewUpdate() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).updateP();
		}
	}

}
