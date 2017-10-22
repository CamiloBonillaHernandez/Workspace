package Logic;

public class OperationType implements Expression {
	
	private String operation;
	
	public OperationType(String o){
		this.operation = o;
	}

	public void interpret(Context context){
		context.setOperation(this.operation);
	}

}
