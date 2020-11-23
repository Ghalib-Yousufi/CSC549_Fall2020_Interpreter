package Parser;

public class QuestionStatement extends Statement{

	private Expression booleanExpression;

	public QuestionStatement(Expression booleanExpression)
	{
		super("Question Statement");
		this.booleanExpression = booleanExpression;
	}

	public String toString()
	{
		return super.toString() + "\n\t" + " = " + this.booleanExpression;
	}

	public Expression getBooleanExpression()
	{
		return booleanExpression;
	}

}