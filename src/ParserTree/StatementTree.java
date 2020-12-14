package ParserTree;

import java.util.ArrayList;

public class StatementTree extends StatementPart
{
	public ArrayList<PartTree> statementTree;
	protected String statementTreetype;

	public StatementTree(String statementTreetype)
	{
		super("Statement Tree"); //this line would automatically happen since we have a zero arg constructor
		this.statementPartType = statementTreetype;
		this.statementTree = new ArrayList<PartTree>();
	}

	public String toString()
	{
		return super.toString() + this.statementTree;
	}

}