package Actions;

import Logic.Command;
import Logic.Tank;

public class FillTank implements Command{
	private Tank tank;
	
	public FillTank(Tank t){
		this.tank = t;
	}

	public void execute() {
		tank.empty();
		tank.Fill();
	}

}
