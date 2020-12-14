package ParserTree;

public abstract class ExpressionPart extends PartTree
{	
	protected String expressionPartType;

	public ExpressionPart(String expressionPartType)
	{
		super("ExpressionPart");
		this.expressionPartType = expressionPartType;
	}
	public String toString()
	{
		return "\n"+ "\t" + this.expressionPartType;
	}

}