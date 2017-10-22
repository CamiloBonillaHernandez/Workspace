package Logic;

public class Invoker {
	private Command command;
	
	public Invoker(){

	}
	
	public void run(){
		command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	
}
