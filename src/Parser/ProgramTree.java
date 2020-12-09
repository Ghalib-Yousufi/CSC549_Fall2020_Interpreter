package Parser;

import java.util.ArrayList;

public class ProgramTree
{
	ArrayList<StatementTree> statementTree;

	public ProgramTree(ArrayList<StatementTree> statementTree)
	{
		this.statementTree = statementTree;
	}

	public ArrayList<StatementTree> getStatementTree()
	{
		return this.statementTree;
	}
}