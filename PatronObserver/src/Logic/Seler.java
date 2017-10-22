package Logic;

import java.util.ArrayList;

public class Seler {
	
	public void newProduct(Product p, Buyer b){
		b.setP(p);
		NotifyNewProduct n = new NotifyNewProduct();
		if (p.getState().equals("New")) {
			n.notifyObserversNewProduct();
		}else if(p.getState().endsWith("Update")){
			n.notifyObserversNewUpdate();
		}
	}
}
