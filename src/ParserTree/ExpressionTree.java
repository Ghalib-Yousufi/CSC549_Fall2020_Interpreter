package ParserTree;

public class ExpressionTree extends ExpressionPart
{
	public ExpressionPart left;
	public SymbolTree symbol;
	public ExpressionPart right;

	public ExpressionTree(PartTree expressionPartType, ExpressionPart left, SymbolTree symbol, ExpressionPart right)
	{
		super("Expression Tree");
		this.left = left;
		this.symbol = symbol;
		this.right = right;
	}

	public ExpressionPart getLeft()
	{
		return left;
	}

	public SymbolTree getSymbol()
	{
		return symbol;
	}

	public ExpressionPart getRight()
	{
		return right;
	}

}