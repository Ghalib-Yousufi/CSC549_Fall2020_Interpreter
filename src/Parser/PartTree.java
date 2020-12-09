package Parser;

public abstract class PartTree
{
	public PartTree parent;

	public PartTree(PartTree parent)
	{
		this.parent = parent;
	}
}