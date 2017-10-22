package Logic;

public interface Action {
	
	public void attach(NewProduct observer);
	public void dettach(NewProduct observer);
	public void notifyObserversNewProduct();
	public void notifyObserversNewUpdate();
}
