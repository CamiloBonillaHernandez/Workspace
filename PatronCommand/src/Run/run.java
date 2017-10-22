package Run;

import Actions.EvacuateTank;
import Actions.FillTank;
import Logic.Command;
import Logic.Invoker;
import Logic.MainTank;
import Logic.ReserveTank;

public class run {
	
	public static void main(String[] args) {
		
		Command c1 = new EvacuateTank(new MainTank());
		Command c2 = new FillTank(new ReserveTank());

		Invoker tankManager = new Invoker();
		
		tankManager.setCommand(c1);
		tankManager.run();
		
		System.out.println("-------------------------");
		
		tankManager.setCommand(c2);
		tankManager.run();
	
		
	}
}
