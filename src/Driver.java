import Parser.*;
import ParserTree.LanguageCore;
import ParserTree.PartTree;

public class Driver 
{

	public static void main(String[] args) 
	{
		Parser.parseTree("input.spyder");
		ParserTree.ProgramTree tree = new ParserTree.ProgramTree(Parser.getTheListOfTokens());
		tree.CreateParserTree();
		tree.DisplayParserTree();
	}
}