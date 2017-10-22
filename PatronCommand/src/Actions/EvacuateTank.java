package Actions;

import Logic.Command;
import Logic.Tank;

public class EvacuateTank implements Command{
	private Tank tank;
	
	public EvacuateTank(Tank t){
		this.tank = t;
	}

	public void execute() {
		tank.full();
		tank.Evacuate();
	}

}
