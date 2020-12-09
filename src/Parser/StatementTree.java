package Parser;

import java.util.ArrayList;

public class StatementTree extends StatementPart
{
	public ArrayList<PartTree> statementTree;

	public StatementTree(PartTree statementPartType, ArrayList<PartTree> statementTree)
	{
		super(statementPartType);
		this.statementTree = statementTree;
	}

	public ArrayList<PartTree> getStatementTree()
	{
		return this.statementTree;
	}

}