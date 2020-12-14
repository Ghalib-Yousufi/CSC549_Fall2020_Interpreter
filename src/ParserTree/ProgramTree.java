package ParserTree;

import java.util.ArrayList;

public class ProgramTree
{
	ArrayList<StatementTree> statementTree;
	private ArrayList<String> theTokens;

	public ProgramTree(ArrayList<String> theTokens)
	{
		this.theTokens = theTokens;
	}
	
	public void CreateParserTree()
	{
		CreateCorrespondingTree(theTokens);
	}

	public void DisplayParserTree()
	{
		for(StatementTree s : statementTree)
		{
			System.out.println(s);
		}
	}
	
	private void CreateCorrespondingTree(ArrayList<String> theTokens)
	{
		String firstTokenIdentifier = theTokens.get(0);

		if(LanguageCore.isReservedWord(firstTokenIdentifier))
		{
			SymbolTree type = new SymbolTree(theTokens.get(1));
			SymbolTree varName = new SymbolTree(theTokens.get(2));
			LiteralExpressionTree value = new LiteralExpressionTree(theTokens.get(3));	

			RememberStatementTree rst = new RememberStatementTree(type , varName, value);
			statementTree.add(rst);
		}

	}

	public ArrayList<StatementTree> getStatementTree()
	{
		return this.statementTree;
	}
}