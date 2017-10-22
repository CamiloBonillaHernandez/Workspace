package Run;

import java.util.ArrayList;

import Logic.Context;
import Logic.Expression;
import Logic.NumericExpression;
import Logic.OperationType;

public class run {

	public static void main(String[] args) {

		ArrayList<Expression> tree = new ArrayList();
		Context context = new Context();

		for(String token : args){
			if(context.getInteger(token) >= 0)
				tree.add(new NumericExpression(token));
			else
				tree.add(new OperationType(token));
		}

		for(Expression e : tree)
			e.interpret(context);
		System.out.println("Interpret:  " + context.getResult());

	}
}
