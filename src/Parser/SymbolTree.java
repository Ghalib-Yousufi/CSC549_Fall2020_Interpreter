package Parser;

public class SymbolTree extends ExpressionPart
{
	public String symbol;

	public SymbolTree(PartTree parent, String symbol)
	{
		super(parent);
		this.symbol = symbol;
	}

	public String getSymbol()
	{
		return symbol;
	}

}