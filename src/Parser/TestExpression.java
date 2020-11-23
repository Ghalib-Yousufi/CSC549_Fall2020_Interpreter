package Parser;

public class TestExpression extends Expression
{
	private Expression leftExpression;


	private Expression rightExpression;
	private String logicalOperator;

	public TestExpression(Expression leftExpression, String logicalOperator, Expression rightExpression)
	{
		super("Test Expression");
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
		this.logicalOperator = logicalOperator;
	}

	public String toString()
	{
		return super.toString() + "\n\t" + this.leftExpression.toString() + " "
				+ this.logicalOperator + " " + this.rightExpression.toString();
	}

	public Expression getLeftExpression() {
		return leftExpression;
	}

	public Expression getRightExpression() {
		return rightExpression;
	}

	public String getLogicalOperator() {
		return logicalOperator;
	}

}