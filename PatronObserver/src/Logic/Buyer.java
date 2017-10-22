package Logic;

public class Buyer implements NewProduct {
	private Product p ;

	public void newP() {
		// TODO Auto-generated method stub
		System.out.println("new product: "+ getP().getName()+" "+ getP().getDescription());
	}

	public void updateP() {
		// TODO Auto-generated method stub
		System.out.println("new update: "+ getP().getName()+" "+ getP().getDescription());
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	
	
	

}
