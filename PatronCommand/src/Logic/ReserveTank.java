package Logic;

public class ReserveTank implements Tank{
	
	public void empty() {
		System.out.println("the Reserve tank is empty");
	}

	public void full() {
		System.out.println("the Reserve tank is full");
	}

	public void Fill() {
		System.out.println("Fill up the Reserve tank");
	}

	public void Evacuate() {
		System.out.println("Evacuating the Reserve tank");
	}
}
